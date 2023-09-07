package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {

		String score1 = JOptionPane.showInputDialog("Enter a test score");

		double score2 = Double.parseDouble(score1);

		if (score2 > 89.999){
			JOptionPane.showMessageDialog(null, "That's a great score!");
		}

	}
}
