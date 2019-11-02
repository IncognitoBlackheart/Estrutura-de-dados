package estrutura_de_dados;

import constants.Constants;

public class DequeSequencial {

	protected Object[] decue = new Object[Constants.INIT_STANDARD_SIZE];
	private int elements;
	
	// Returns the quantity of elements in the decue
	public int size() {
		return elements;
	}

	// Adding elements in the first position of the decue
	public void insertFirst(Object element) {
		if (size() == decue.length) {
			Object[] tempDecue = new Object[decue.length * Constants.DOUBLE_VALUE];
			for (int i = 0; i < (decue.length - 1); i++) {
					tempDecue[i] = decue[i];
			}
			decue = tempDecue;
		}		
	
		if (decue[0] == null) {
			decue[0] = element;
		}
					
		else {
			for (int i = 0; i < size(); i++) {
				if (i != (decue.length - 1)) {
					decue[i+1] = decue[i];
				}
			}
			decue[0] = element;
		}
		elements++;
	}
	
	// Adding elements in the last position of the decue
	public void insertLast(Object element) {
		if (size() == decue.length) {
			Object[] tempDecue = new Object[decue.length * Constants.DOUBLE_VALUE];
			for (int i = (tempDecue.length - 1); i >= 0; i--) {
				if (i >= (tempDecue.length/Constants.HALF)) {
					tempDecue[i] = decue[i-(tempDecue.length/Constants.HALF)];
				}
			}
			decue = tempDecue;
		}
			
		if (decue[(decue.length - 1)] == null) {
			decue[(decue.length - 1)] = element;
		}
			
		else {
			for (int i = 0; i <= size(); i++) {
				if (i != (decue.length - 1)) {
					decue[i] = decue[i+1];
				}
			}
			decue[(decue.length - 1)] = element;
		}
		elements++;
	}

	// Removing elements from the first position of the decue
	public Object deleteFirst() {
		if (!isEmpty()) {
			Object removed = decue[0];
			if (size() != decue.length) {
				for (int i = 0; i <= size(); i++) {
					if (i != (decue.length - 1) && decue[i] != null) {
						decue[i] = decue[i+1];
					}
				}
				elements--;
			}
		
			else {
				for (int i = 0; i < (size() - 1); i++) {
					decue[i] = decue[i+1];
				}
				decue[decue.length - 1] = null;
				elements--;
			}
			return removed;
		}
		return null;
	}
	
	// Removing elements from the last position of the decue
	public Object deleteLast() {
		if (!isEmpty()) {
			Object removed = decue[(decue.length - 1)];
			if (size() != decue.length) {
				for (int i = (decue.length - 1); i >= (decue.length - size()); i--) {
					decue[i] = decue[i-1];
				}
				elements--;
			}
		
			else {
				for (int i = (decue.length - 1); i > (decue.length - size()); i--) {
					decue[i] = decue[i-1];
				}
				decue[0] = null;
				elements--;
			}
			return removed;
		}
		return null;
	}
		
	// Returns the head of the decue
	public Object getFront() {
		if (!isEmpty()) {
			return decue[0];
		}
		return null;
	}

	// Returns the tail of the decue
	public Object getRear() {
		if (!isEmpty()) {
			return decue[(decue.length - 1)];
		}
		return null;
	}
			
	// Says if the queue is empty or not
	public boolean isEmpty() {
		return size() == 0;
	}
}