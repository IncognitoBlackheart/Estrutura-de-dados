package estrutura_de_dados;

import constants.Constants;

public class PilhaSequencial {

	protected Object[] stack = new Object[Constants.INIT_STANDARD_SIZE];
	private int elements;
	
	// Pushing elements into the stack
	public void push(Object element) {
		if (size() == stack.length) {
			Object[] tempStack = new Object[stack.length * Constants.DOUBLE_VALUE];
			for (int i = 0; i < (stack.length - 1); i++) {
					tempStack[i] = stack[i];
			}
			stack = tempStack;
		}		
	
		if (stack[0] == null) {
			stack[0] = element;
		}
					
		else {
			for (int i = 0; i < size(); i++) {
				if (i != (stack.length - 1)) {
					stack[i+1] = stack[i];
				}
			}
			stack[0] = element;
		}
		elements++;
	}
	
	// Popping elements out of the stack
	public Object pop() {
		if (size() > 0) {
			Object removed = stack[0];
			if (size() != stack.length) {
				for (int i = 0; i <= (size() - 1); i++) {
					stack[i] = stack[i+1];
				}
				elements--;
			}
			
			else {
				for (int i = 0; i < (size() - 1); i++) {
					stack[i] = stack[i+1];
				}
				stack[stack.length - 1] = null;
				elements--;
			}
			return removed;
		}
		return null;
	}
	
	// Returns the top of the stack
	public Object top() {
		if (size() > 0) {
			return stack[0];
		}
		return null;
	}
	
	// Returns the quantity of elements in the stack
	public int size() {
		return elements;
	}
		
	// Clears the stack
	public void clear() {
		for (int i = 0; i < stack.length; i++) {
			stack[i] = null;
		}
		elements = 0;
	}
}
