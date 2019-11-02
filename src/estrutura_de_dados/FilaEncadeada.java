package estrutura_de_dados;

import data_for_linked_structures.Node;

public class FilaEncadeada {
	private Node start;
	private Node end;
	private int elements;
	
	// Adding elements in the queue
	public void enqueue(Node element) {
		if (start == null) {
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

	// Removing elements from the queue
	public Node dequeue() {
		Node front = null;
		if (start != null) {
			front = start;
			start = start.getNext();
			elements--;
		}
		return front;
	}
	
	// Returns the quantity of elements in the queue
	public int size() {
		return elements;
	}
	
	// Returns the head of the queue
	public Node getFront() {
		return start;
	}
	
	// Returns the tail of the queue 
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
	
	// Says if the queue is empty or not
	public boolean isEmpty() {
		return size() == 0;
	}
}