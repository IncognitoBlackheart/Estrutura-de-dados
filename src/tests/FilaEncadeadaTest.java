package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import data_for_linked_structures.Node;
import estrutura_de_dados.FilaEncadeada;

public class FilaEncadeadaTest {

	private FilaEncadeada queue;
	
	@Before
	public void SequentialQueueTest() {
		queue = new FilaEncadeada();
	}
	
	@Test
	public void testEnqueue() {
		queue.enqueue(new Node("1"));
		queue.enqueue(new Node("2"));
		Assert.assertEquals(queue.getFront().getData(), "1");
		Assert.assertEquals(queue.size(), 2);
	}

	@Test
	public void testDequeue() {
		queue.enqueue(new Node("1"));
		queue.enqueue(new Node("2"));
		queue.dequeue();
		Assert.assertEquals(queue.getFront().getData(), "2");
		Assert.assertEquals(queue.size(), 1);
	}

	@Test
	public void testSize() {
		queue.enqueue(new Node("1"));
		queue.enqueue(new Node("2"));
		Assert.assertEquals(queue.size(), 2);
	}

	@Test
	public void testGetFront() {
		queue.enqueue(new Node("1"));
		queue.enqueue(new Node("2"));
		queue.enqueue(new Node("3"));
		Assert.assertEquals(queue.getFront().getData(), "1");
	}

	@Test
	public void testGetRear() {
		queue.enqueue(new Node("1"));
		queue.enqueue(new Node("2"));
		queue.enqueue(new Node("3"));
		Assert.assertEquals(queue.getRear().getData(), "3");
	}

	@Test
	public void testIsEmpty1() {
		Assert.assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testIsEmpty2() {
		queue.enqueue(new Node("A"));
		Assert.assertFalse(queue.isEmpty());
	}
}