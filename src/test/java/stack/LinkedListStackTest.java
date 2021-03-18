package stack;

import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListStackTest {

	@Test
	public void newStackShouldBeEmpty() {
		// GIVEN
		// TODO
		// WHEN
		// TODO
		// THEN
		// TODO
	}

	@Test
	public void testPushPop() throws IsEmptyException {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		int value1 = 42;
		// WHEN
		s.push(value1);
		int val = s.pop();
		// THEN
		assertEquals(value1, val);
	}

	@Test
	public void testPushPushPop() throws IsEmptyException  {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		int value1 = 42;
		int value2 = 1024;
		// WHEN
		s.push(value1);
		s.push(value2);
		int val = s.pop();
		// THEN
		assertEquals(value2, val);
	}

	@Test
	public void testPushPushPopPop() throws IsEmptyException  {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		int value1 = 42;
		int value2 = 1024;
		// WHEN
		s.push(value1);
		s.push(value2);
		s.pop();
		int val = s.pop();
		// THEN
		assertEquals(value1, val);
	}
	
	@Test
	public void testPushPushTopTop() throws IsEmptyException  {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		int value1 = 42;
		int value2 = 1024;
		// WHEN
		s.push(value1);
		s.push(value2);
		s.top();
		int val = s.top();
		// THEN
		assertEquals(value2, val);
	}
	
	@Test(expected = IsEmptyException.class)
	public void testIsEmptyExceptionWithPop() throws IsEmptyException  {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		int value1 = 42;
		int value2 = 1024;
		// WHEN
		s.push(value1);
		s.push(value2);
		s.pop();
		s.pop();
		s.pop();
		// THEN
	}
	
	@Test(expected = IsEmptyException.class)
	public void testIsEmptyExceptionWithTop() throws IsEmptyException  {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		int value1 = 42;
		int value2 = 1024;
		// WHEN
		s.push(value1);
		s.push(value2);
		s.pop();
		s.pop();
		s.top();
		// THEN
	}
		
	@Test
	public void testStringOfEmptyStack() {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		// WHEN
		String str = s.toString();
		// THEN
		assertEquals("[]", str);
	}

	@Test
	public void testStringOfOneElementStack() {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		List<Integer> values = Arrays.asList(1);
		String expected = "[1]";
		// WHEN
		for (int val: values){
			s.push(val);
		}
		String str = s.toString();
		// THEN
		assertEquals(expected, str);
	}

	@Test
	public void testStringOfTwoElementsStack() {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		List<Integer> values = Arrays.asList(1, 2);
		String expected = "[1, 2]";
		// WHEN
		for (int val: values){
			s.push(val);
		}
		String str = s.toString();
		// THEN
		assertEquals(expected, str);
	}

	@Test
	public void testHugeStack() {
		// GIVEN
		LinkedListStack s = new LinkedListStack();
		List<Integer> values = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10);
		String expected = "[1, 2, 4, 5, 6, 7, 8, 9, 10]";
		// WHEN
		for (int val: values){
			s.push(val);
		}
		String str = s.toString();
		// THEN
		assertEquals(expected, str);
	}

}
