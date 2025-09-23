// exception used for Q5
class CalculateException extends RuntimeException{    
	public CalculateException(String err) {
		super(err);
	}
}

public class Calculator {

	/*
	 *  Methods for Part 3
	 */
	public static int calculate(String [] cmds){
		Stack pstack = new Stack(100);
		
		Reverse.reverse(cmds);
		// This line will call the reverse method and reverse the order of the elements in the array.
		
		for (String element : cmds) {
			// For loop that will iterate for each element in the array.
			if (isNumber(element)) {
				// The if statement will call the method isNumber to check if the element is a integer or a String.
				pstack.push(convert(element));
				// The value in the array is being converted (by calling the convert method) to an integer and is being added to the top of the stack pstack.
			}else {
				int firstPop = (int) pstack.pop();
				int secondPop = (int) pstack.pop();
				// The stack is being popped twice which will remove the last two elements from the top of the stack.
				// The popped values are being stored in two variables; firstPop and secondPop.
				pstack.push(applyOp(firstPop, element, secondPop));
				/*
				 *  The two popped values are being either added, subtracted, multiplied or divided (depending on the operation) by calling the method
				 *  applyOp. The method will the return a single integer value which will then be added to the top of the Stack.
				 */
			}
		}
		
		return 0; // dummy value
	}	

	public static int convert(String s) throws NumberFormatException{
		
		return Integer.parseInt(s);
		// This line of code will change the string value to an integer and return the value as an integer.
		
	}

	public static boolean isNumber(String s){
		
		try {
			Integer.parseInt(s);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
		/*
		 *  The try catch statement will check if the value is an integer, if it is then it will return true, else it will return false. It checks
		 *  by seeing if the String can be converted to an integer, if it cannot then an exception will be thrown.
		 */
		
	}

	// apply the operator after converting the numbers
	public static int applyOp(int fst,String op,int snd) throws CalculateException{
		
		if (op.equals("+")) {
			// Checks if the operation is a plus.
			return fst + snd;
			// Returns the sum of the two popped values (check calculate method for popped values).
		}else if (op.equals("-")) {
			// Checks if the operation is a subtract.
			return fst - snd;
			// Returns the subtraction of the first popped value and the second popped value (check calculate method for popped values).
		}else if (op.equals("*")) {
			// Checks if the operation is a multiplication.
			return fst * snd;
			// Returns the multiplied value of the two popped values (check calculate method for popped values).
		}else if (op.equals("/")) {
			// Checks if the operation is a divide.
			return fst / snd;
			// Returns the divided value of the first and second popped values (check calculate method for popped values).
		}else {
			throw new CalculateException("CalculateException");
			// If the operation was not +, -, * or / then an exception will be thrown to prevent the code from crashing.
		}
		
	}
}
