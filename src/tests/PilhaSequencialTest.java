package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import estrutura_de_dados.PilhaSequencial;

public class PilhaSequencialTest {

	private PilhaSequencial stack;
	
	@Before
	public void SequentialStackTest() {
		stack = new PilhaSequencial();
	}
	
	@Test
	public void testPush1() {
		stack.push("A");
		Assert.assertEquals(stack.top(), "A");
	}

	@Test
	public void testPush2() {
		stack.push("A");
		stack.push("B");
		stack.push("C");
		Assert.assertEquals(stack.top(), "C");
	}
	
	@Test
	public void testPop() {
		stack.push("A");
		stack.push("B");
		stack.pop();
		Assert.assertEquals(stack.top(), "A");
	}

	@Test
	public void testTop() {
		stack.push("A");
		stack.push("B");
		Assert.assertEquals(stack.top(), "B");
	}

	@Test
	public void testSize1() {
		stack.push("A");
		stack.push("B");
		Assert.assertEquals(stack.size(), 2);
	}
	
	@Test
	public void testSize2() {
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		Assert.assertEquals(stack.size(), 4);
	}

	@Test
	public void testClear() {
		stack.push("A");
		stack.push("B");
		stack.clear();
		Assert.assertEquals(stack.size(), 0);
	}
}
