package stackHandler.handler;

import umg.edu.gt.data_structure.stack.manual.StackLinked;
import umg.edu.gt.data_structure.stack.impl.SymbolValidator;

public class Main {
	
	public static void main(String[] args) {
		/*StackLinked stack = new StackLinked();

        stack.initStack('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Tamanio? " + stack.size());
        System.out.println("Peek: " + stack.peek()); // C
        System.out.println("Pop: " + stack.pop());   // C
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());   // B
        System.out.println("Vacia? " + stack.isEmpty()); // false
        System.out.println("Pop: " + stack.pop());   // A
        System.out.println("Vacia? " + stack.isEmpty()); // true
        System.out.println("Pop: " + stack.pop());   // A
        */
		
		SymbolValidator validator = new SymbolValidator();

        String caso1 = "(a+b) * [c-d]";
        String caso2 = "([)]";

        System.out.println("=== RESULTADOS DEL VALIDADOR ===");
        System.out.println("Expresion 1: " + caso1 + " -> " + validator.isBalanced(caso1));
        System.out.println("Expresion 2: " + caso2 + " -> " + validator.isBalanced(caso2));
        System.out.println("================================\n");
    }
}
