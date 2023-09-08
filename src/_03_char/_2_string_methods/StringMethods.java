package _03_char._2_string_methods;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		//String var = JOptionPane.showInputDialog("Give me a word");
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		//char character = var.charAt(0);

		// 3. Print the length of your String to the console.
		//    HINT: .length()
		//System.out.println(var.length());

		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		//for ( int i = 0; i < var.length(); i++) {
		//	System.out.println(var.charAt(i));
		//}


		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		String input = JOptionPane.showInputDialog("Enter a character from \"My string\"");
		String rar = "My String";
		for (int i = 0; i <rar.length(); i++) {
			char char2 = rar.charAt(i);
			if (char2 == input.charAt(0)) {
			System.out.println(input + " is at index "+i);
			}
		}



	}
}


