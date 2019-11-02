package estrutura_de_dados;

import data_for_linked_structures.Node;

public class DequeEncadeado {
	private Node start;
	private Node end;
	private int elements;
	
	// Returns the quantity of elements in the decue
	public int size() {
		return elements;
	}
	
	// Adding elements in the first position of the decue
	public void insertFirst(Node element) {
		if (size() == 0) {
			start = element;
		}
		else {
			element.setNext(start);
			start = element;
		}
		elements++;
	}
	
	// Adding elements in the last position of the decue
	public void insertLast(Node element) {
		if (size() == 0) {
			start = element;
		}
		else {
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(element);
		}
		elements++;
	}
	
	// Removing elements from the first position of the decue
	public Node removeFirst() {
		Node front = null;
		if (start != null) {
			front = start;
			start = start.getNext();
			elements--;
		}
		return front;
	}
	
	// Removing elements from the last position of the decue
	public Node removeLast() {
		Node tail = start;
		while (tail.getNext() != null) {
			tail = tail.getNext();
		}
		tail = end;
		end = null;
		elements--;
		return tail;
	}
		
	// Returns the head of the decue
	public Node getFront() {
		return start;
	}
		
	// Returns the tail of the decue 
	public Node getRear() {
		if (start != null) {
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			end = temp;
		}
		return end;
	}
		
	// Says if the decue is empty or not
	public boolean isEmpty() {
		return size() == 0;
	}
}
