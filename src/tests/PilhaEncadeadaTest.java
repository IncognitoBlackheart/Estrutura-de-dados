package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import data_for_linked_structures.Node;
import estrutura_de_dados.PilhaEncadeada;

public class PilhaEncadeadaTest {
	private PilhaEncadeada stack;
	
	@Before
	public void linkedStackTest() {
		stack = new PilhaEncadeada();
	}
	
	@Test
	public void testPush1() {
		stack.push(new Node("1"));
		stack.push(new Node("2"));
		Assert.assertEquals(stack.top().getData(), "2");
		Assert.assertEquals(stack.size(), 2);
	}

	@Test
	public void testPush2() {
		stack.push(new Node("1"));
		stack.push(new Node("2"));
		stack.push(new Node("3"));
		stack.push(new Node("4"));
		stack.push(new Node("5"));
		Assert.assertEquals(stack.top().getData(), "5");
		Assert.assertEquals(stack.size(), 5);
	}
	
	@Test
	public void testPop() {
		stack.push(new Node("1"));
		stack.push(new Node("2"));
		stack.pop();
		Assert.assertEquals(stack.top().getData(), "1");
		Assert.assertEquals(stack.size(), 1);
	}

	@Test
	public void testTop() {
		stack.push(new Node("1"));
		stack.push(new Node("2"));
		stack.push(new Node("3"));
		Assert.assertEquals(stack.top().getData(), "3");
	}

	@Test
	public void testSize() {
		stack.push(new Node("1"));
		stack.push(new Node("2"));
		Assert.assertEquals(stack.size(), 2);
	}

	@Test
	public void testClear() {
		stack.push(new Node("1"));
		stack.push(new Node("2"));
		stack.push(new Node("3"));
		stack.clear();
		Assert.assertEquals(stack.size(), 0);
	}

}
