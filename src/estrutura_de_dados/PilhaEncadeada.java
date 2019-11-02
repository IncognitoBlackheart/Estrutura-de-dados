package estrutura_de_dados;

import data_for_linked_structures.Node;

public class PilhaEncadeada {
	private Node start;
	private int elements;
	
	// Pushing elements into the stack
	public void push(Node element) {
		if (size() == 0) {
			start = element;
		}
		else {
			element.setNext(start);
			start = element;
		}
		elements++;
	}
	
	// Popping elements out of the stack
	public Node pop() {
		Node front = null;
		if (start != null) {
			front = start;
			start = start.getNext();
			elements--;
		}
		return front;
	}
	
	// Returns the top of the stack
	public Node top() {
		return start;
	}
	
	// Returns the quantity of elements in the decue
	public int size() {
		return elements;
	}
	
	// Clears the stack
	public void clear() {
		start = null;
		elements = 0;
	}
}