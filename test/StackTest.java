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
	public void testSizeEmpty() {
		// test the size of an empty stack (hint: test st.size() )
		assertEquals("The stack is empty", 0, st.size());
		// The assertEquals will check if st.size is the expected output 0
	}
	
	@Test
	public void testSizeNonEmpty() {
		st.push("A");
		st.push("B");
		// test the size of a non-empty stack
		assertEquals("The stack size is 2", 2, st.size());
		// Since two values are pushed the stack will now have a size of 2.
		// The assertEquals will check if the new size of the stack is 2.
	}
	
	@Test
	public void testPopTwo() {
		st.push("A");
		st.push("B");
		// step 1: test what st.pop() returns
		assertEquals("The stack has been popped", "B", st.pop());
		// The assertEquals will check if st.pop returns the correct value (The value that was at the top of the stack).
		// step 2: test what st.pop() returns
		assertEquals("The stack has been popped again", "A", st.pop());
		// The assertEquals will check if st.pop the correct value of the new value that was at the top of the stack.
	}
	
	@Test
	public void testTopTwo() {
		st.push("A");
		// step 1: test what st.top() returns
		assertEquals("Top has returned A", "A", st.top());
		// The assertEquals will check the top value in the stack (A) and will compare it with the expected value (A).
		// step 2: test what st.top() returns
		assertEquals("Top has returned A", "A", st.top());
		// Since top does not remove the top value then A is still the expected top value of the stack.
	}
	
	@Test
	public void testIsEmptyTrue() {
		// step 1: test the boolean result from the isEmpty() method
		assertTrue("The stack is empty", st.isEmpty());
		// assertTrue was used instead of assertEquals since we are checking for a boolean value and assertTrue will check if st.isEmpty is true automatically.
		// Using an assertTrue is shorter than using assertEquals.
	}
	
	@Test
	public void testIsEmptyFalse() {
		// step 1: add an element to the stack
		st.push("an element");
		// st.push will add the element "an element" to the stack.
		
		// step 2: test the boolean result from the isEmpty() method
		assertFalse("The stack is not empty", st.isEmpty());
		// assertFalse was used instead of assertEquals since we are checking for a false boolean response and assertFalse automatically checks for false answers.
	}
	
	@Test(expected = StackException.class)
	public void testEmptyPop() throws Exception {
		// try popping from an empty stack
		st.pop();
		// st.pop will try to remove an element from an empty array.
		throw new Exception("StackException");
		// The StackException is thrown and this will prevent stack operation that are not correct (such as using pop on an empty stack) from causing errors.
	}

	@Test(expected = StackException.class)
	public void testFullPush() throws Exception {
		// try pushing too many elements to the stack
		// (which has a capacity of 2 elements)
		st.push("element 1");
		// st.push will add the element "element 1" to the stack.
		st.push("element 2");
		// st.push will add the element "element 2" to the stack.
		st.push("element 3");
		// st.push will add the element "element 3" to the stack.
		
		throw new Exception("StackException");
		// The StackException is thrown which will prevent any errors (pushing too many elements into the stack) from crashing the code.
	}

}
