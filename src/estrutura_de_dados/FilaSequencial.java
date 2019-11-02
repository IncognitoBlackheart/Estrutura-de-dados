package estrutura_de_dados;
import constants.Constants;
public class FilaSequencial {

	protected Object[] queue = new Object[Constants.INIT_STANDARD_SIZE];
	private int elements;

	// Adding elements in the queue
	public void enqueue(Object element) {
		if (size() == queue.length) {
			Object[] tempQueue = new Object[queue.length * Constants.DOUBLE_VALUE];
			for (int i = (tempQueue.length - 1); i >= 0; i--) {
				if (i >= (tempQueue.length/2)) {
					tempQueue[i] = queue[i-(tempQueue.length/2)];
				}
			}
			queue = tempQueue;
		}
		
		if (queue[(queue.length - 1)] == null) {
			queue[(queue.length - 1)] = element;
		}
		
		else {
			for (int i = 0; i <= size(); i++) {
				if (i != (queue.length - 1)) {
					queue[i] = queue[i+1];
				}
			}
			queue[(queue.length - 1)] = element;
		}
		elements++;
	}

	// Removing elements from the queue
	public Object dequeue() {
		Object dequeued = queue[(queue.length - size())];
		if (size() != queue.length) {
			if (!isEmpty()) {
				for (int i = 0; i <= size(); i++) {
					if (i != (queue.length - 1)) {
						if (queue[i] != null) {
							queue[i] = queue[i+1];
						}
					}
				}
				queue[(queue.length - size())] = null;
				elements--;
			}
		}
		else {
			for (int i = 0; i <= size(); i++) {
				if (i != (queue.length - 1)) {
					queue[i] = queue[i+1];
				}
			}
			queue[(queue.length - size())] = null;
			elements--;
		}
		return dequeued;
	}

	// Returns the quantity of elements in the queue
	public int size() {
		return elements;
	}
	
	// Returns the head of the queue
	public Object getFront() {
		return queue[(queue.length - size())];
	}

	// Returns the tail of the queue 
	public Object getRear() {
		return queue[(queue.length - 1)];
	}
	
	// Says if the queue is empty or not
	public boolean isEmpty() {
		return size() == 0;
	}
}