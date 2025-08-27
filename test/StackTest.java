import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {

	Stack st;
	@Before
	public void setup()
	{
		st = new Stack(2);
	}
	
	/*
	 * Part1: complete the following test methods as specified.
	 */
	
	@Test
	public void testPushEmptySize() {
		// test the size of an empty stack (hint: test st.size() )
		fail("not implemented yet");
	}
	
	@Test
	public void testPushNonEmptySize() {
		st.push("A");
		st.push("B");
		// test the size of a non-empty stack
		fail("not implemented yet");
	}
	
	@Test
	public void testPopTwo() {
		st.push("A");
		st.push("B");
		// step 1: test what st.pop() returns
		fail("not implemented yet");
		// step 2: test what st.pop() returns
		fail("not implemented yet");
	}
	
	@Test
	public void testTopTwo() {
		st.push("A");
		// step 1: test what st.top() returns
		fail("not implemented yet");
		// step 2: test what st.top() returns
		fail("not implemented yet");
	}
	
	@Test
	public void testIsEmptyTrue() {
		// step 1: test the boolean result from the isEmpty() method
		fail("not implemented yet");
	}
	
	@Test
	public void testIsEmptyFalse() {
		// step 1: add an element to the stack
		
		// step 2: test the boolean result from the isEmpty() method
		fail("not implemented yet");
	}
	
	@Test(expected = StackException.class)
	public void testEmptyPop() {
		// try popping from an empty stack
		fail("not implemented yet");
	}

	@Test(expected = StackException.class)
	public void testFullPush() {
		// try pushing too many elements to the stack
		// (which has a capacity of 2 elements)
		fail("not implemented yet");
	}

}
