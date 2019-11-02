package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import estrutura_de_dados.DequeSequencial;

public class DequeSequencialTest {
	private DequeSequencial decue;
	
	@Before
	public void SequentialDecueTest() {
		decue = new DequeSequencial();
	}
	
	@Test
	public void testSize() {
		decue.insertFirst("A");
		decue.insertFirst("B");
		Assert.assertEquals(decue.size(), 2);
	}

	@Test
	public void testInsertFirst() {
		decue.insertFirst("A");
		decue.insertFirst("B");
		Assert.assertEquals(decue.getFront(), "B");
		Assert.assertEquals(decue.size(), 2);
	}

	@Test
	public void testInsertLast() {
		decue.insertLast("A");
		decue.insertLast("B");
		Assert.assertEquals(decue.getRear(), "B");
		Assert.assertEquals(decue.size(), 2);
	}

	@Test
	public void testDeleteFirst() {
		decue.insertFirst("A");
		decue.insertFirst("B");
		decue.deleteFirst();
		Assert.assertEquals(decue.getFront(), "A");
		Assert.assertEquals(decue.size(), 1);
	}

	@Test
	public void testDeleteLast() {
		decue.insertLast("A");
		decue.insertLast("B");
		decue.deleteLast();
		Assert.assertEquals(decue.getRear(), "A");
		Assert.assertEquals(decue.size(), 1);
	}

	@Test
	public void testGetFront() {
		decue.insertFirst("A");
		decue.insertFirst("B");
		Assert.assertEquals(decue.getFront(), "B");
	}

	@Test
	public void testGetRear() {
		decue.insertLast("A");
		decue.insertLast("B");
		Assert.assertEquals(decue.getRear(), "B");
	}

	@Test
	public void testIsEmpty1() {
		Assert.assertTrue(decue.isEmpty());
	}
	
	@Test
	public void testIsEmpty2() {
		decue.insertFirst("A");
		Assert.assertFalse(decue.isEmpty());
	}
}
