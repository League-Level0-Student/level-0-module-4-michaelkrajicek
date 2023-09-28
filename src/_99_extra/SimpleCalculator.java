package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.

		while(true) {

			String input = JOptionPane.showInputDialog("Enter an integer.");
			String input2 = JOptionPane.showInputDialog("Enter annother integer.");

			int inputint = Integer.parseInt(input);
			int inputint2 = Integer.parseInt(input2);

			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "Select Operation", "Operation Select", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE" },
					null);//                                                0        1           2          3

			//System.out.println(operation);

			if(operation == 0) {
				add(inputint, inputint2);

			}

			if(operation == 1) {
				subtract(inputint, inputint2);
			}

			if(operation == 2) {
				multiply(inputint, inputint2);
			}

			if(operation == 3) {
				divide(inputint, inputint2);
			}
		}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	static void add(int input, int input2) {

		int sum = input + input2;
		//JOptionPane.showMessageDialog(null, sum);

		String answer = input + " + " + input2 + " = " + sum;
		JOptionPane.showMessageDialog(null, answer);
	}

	static void subtract(int input, int input2) {

		int difference = input - input2;
		//JOptionPane.showMessageDialog(null, difference);

		String answer = input + " - " + input2 + " = " + difference;
		JOptionPane.showMessageDialog(null, answer);


	}

	static void multiply(int input, int input2) {

		int product = input * input2;
		//JOptionPane.showMessageDialog(null, product);

		String answer = input + " * " + input2 + " = " + product;
		JOptionPane.showMessageDialog(null, answer);


	}

	static void divide(int input, int input2) {

		int quotent = input / input2;
		//JOptionPane.showMessageDialog(null, quotent);

		String answer = input + " / " + input2 + " = " + quotent;
		JOptionPane.showMessageDialog(null, answer);


	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, int num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}