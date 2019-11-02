package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import data_for_linked_structures.Node;
import estrutura_de_dados.DequeEncadeado;

public class DequeEncadeadoTest {

	private DequeEncadeado decue;
	
	@Before
	public void linkedDecueTest() {
		decue = new DequeEncadeado();
	}
	
	@Test
	public void testSize() {
		decue.insertFirst(new Node("1"));
		decue.insertLast(new Node("2"));
		Assert.assertEquals(decue.size(), 2);
	}

	@Test
	public void testInsertFirst() {
		decue.insertFirst(new Node("1"));
		decue.insertFirst(new Node("2"));
		Assert.assertEquals(decue.getFront().getData(), "2");
		Assert.assertEquals(decue.size(), 2);
	}

	@Test
	public void testInsertLast() {
		decue.insertLast(new Node("1"));
		decue.insertLast(new Node("2"));
		Assert.assertEquals(decue.getFront().getData(), "1");
		Assert.assertEquals(decue.size(), 2);
	}

	@Test
	public void testRemoveFirst() {
		decue.insertFirst(new Node("1"));
		decue.insertFirst(new Node("2"));
		decue.removeFirst();
		Assert.assertEquals(decue.getFront().getData(), "1");
		Assert.assertEquals(decue.size(), 1);
	}

	@Test
	public void testRemoveLast() {
		decue.insertFirst(new Node("1"));
		decue.insertLast(new Node("2"));
		decue.removeFirst();
		Assert.assertEquals(decue.getFront().getData(), "2");
		Assert.assertEquals(decue.size(), 1);
	}

	@Test
	public void testGetFront() {
		decue.insertFirst(new Node("1"));
		decue.insertFirst(new Node("2"));
		decue.insertFirst(new Node("3"));
		Assert.assertEquals(decue.getFront().getData(), "3");
	}

	@Test
	public void testGetRear() {
		decue.insertFirst(new Node("1"));
		decue.insertFirst(new Node("2"));
		decue.insertFirst(new Node("3"));
		Assert.assertEquals(decue.getRear().getData(), "1");
	}

	@Test
	public void testIsEmpty1() {
		Assert.assertTrue(decue.isEmpty());
	}
	
	@Test
	public void testIsEmpty2() {
		decue.insertFirst(new Node("A"));
		Assert.assertFalse(decue.isEmpty());
	}
}