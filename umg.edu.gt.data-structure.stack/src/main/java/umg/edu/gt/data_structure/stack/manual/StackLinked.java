package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

	private Node top; // tope de la pila

	public boolean isEmpty() {
		return top == null;
	}
	
	public void initStack(char value) {
		top = new Node(value, top, 1); 
	}

	public void push(char value) {
		if (isEmpty()){
			initStack(value);
		} else {
		top = new Node(value, top, top.count); // el nuevo nodo apunta al anterior
	}
		}
	
	public Node getNodeInit() {
		if (isEmpty()) {
			return null;
		}
		
		Node current = top;
		while (current.next != null) {
			current = current.next;
		}
		return current;
	}
	
	public int getCount() {
		return size();
	}
	
	public int size() {
		
		return top.count;
	}

	public char pop() {
		if (isEmpty()) {
			//throw new IllegalStateException("Stack is empty");
			return '0';
		}
		char value = top.value;
		top = top.next;
		return value;
	}

	public char peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack underflow");
		}
		return top.value;
	}

}
