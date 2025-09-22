
public class Reverse {

	// Part 2
	//
	// Where N is the length of array 'arr' the complexity is:
	//
	// O(N)
	//
	/* Because: The loops in the code below will iterate for the length of the array. If the number of iterations was a large number
	 * then it would take a large number of steps to complete. The more inputs (the length of the array) the code has the longer it
	 * will take to compile. 
	 */
	public static void reverse(String[] arr){ 
		
		Stack st = new Stack();
		// Declaring a new stack called st.
		int size = arr.length;
		// Creating a new variable that will store an integer the length of the array.
		
		for (String Letters : arr) {
			st.push(Letters);
		}
		// This is a for loop that will iterate through the elements stored in arr.
		// Each element of arr will be pushed into the stack st.
		
		for (int i = 0; i < size; i++) {
			arr[i] = (String) st.pop();
		}
		// This is a for loop that will repeat for the length of the array.
		// The elements from the stack are popped and placed back into the array.
		
	}
	
}
