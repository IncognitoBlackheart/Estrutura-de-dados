package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import estrutura_de_dados.FilaSequencial;

public class FilaSequencialTest {

	private FilaSequencial queue;
	
	@Before
	public void SequentialQueueTest() {
		queue = new FilaSequencial();
	}
	
	@Test
	public void testEnqueue1() {
		queue.enqueue("A");
		queue.enqueue("B");
		Assert.assertEquals(queue.getFront(), "A");
		Assert.assertEquals(queue.size(), 2);
	}

	@Test
	public void testEnqueue2() {
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		Assert.assertEquals(queue.getFront(), "A");
		Assert.assertEquals(queue.size(), 4);
	}
	
	@Test
	public void testDequeue() {
		queue.enqueue("A");
		queue.enqueue("B");
		queue.dequeue();
		Assert.assertEquals(queue.getFront(), "B");
	}

	@Test
	public void testSize1() {
		queue.enqueue("A");
		queue.enqueue("B");
		Assert.assertEquals(queue.size(), 2);
	}
	
	@Test
	public void testSize2() {
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		Assert.assertEquals(queue.size(), 4);
	}

	@Test
	public void testGetFront() {
		queue.enqueue("A");
		queue.enqueue("B");
		Assert.assertEquals(queue.getFront(), "A");
	}

	@Test
	public void testGetRear() {
		queue.enqueue("A");
		queue.enqueue("B");
		Assert.assertEquals(queue.getRear(), "B");
	}

	@Test
	public void testIsEmpty1() {
		Assert.assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testIsEmpty2() {
		queue.enqueue("A");
		Assert.assertFalse(queue.isEmpty());
	}
}