package umg.edu.gt.data_structure.stack.impl;

// Importa tu propia clase manual
import umg.edu.gt.data_structure.stack.manual.StackLinked;

public class SymbolValidator {
    
    public boolean isBalanced(String s) {
        // AQUÍ EL CAMBIO: Usamos tu propia estructura
        StackLinked stack = new StackLinked(); 
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if (!isPair(top, c)) return false;
            }
        }
        return stack.isEmpty();
    }
    
    private boolean isPair(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '[' && close == ']')
            || (open == '{' && close == '}');
    }
}