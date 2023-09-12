package _01_double._2_test_scores;

import java.util.Random;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {

		Random r  = new Random();
		System.out.println(r.nextInt(100));
		
		String score1 = JOptionPane.showInputDialog("Enter a test score");

		double score2 = Double.parseDouble(score1);

		if (score2 > 89.999){
			JOptionPane.showMessageDialog(null, "That's a great score!");
		}
		if (score2 > 79.99 && score2 < 90){
			JOptionPane.showMessageDialog(null, "That's a good score.");
		}
		if (score2 > 68.99 && score2 < 80){
			JOptionPane.showMessageDialog(null, "That's an okay score. At least you passed");
		}
		if (score2 > 30 && score2 < 69){
			JOptionPane.showMessageDialog(null, "That's a bad score. You failed.");
		}
		if (score2 < 30){
			JOptionPane.showMessageDialog(null, "That's a really bad score. How did you fail this badly!?");
		}
		
	}
}
