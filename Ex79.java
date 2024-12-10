package bookExercises;

import javax.swing.JOptionPane;

public class Ex79 {

	public static void main(String[] args) {

		String userAnswer;

		Ex79methods exercise = new Ex79methods();

		int[] array = new int[30];

		do {

			// Random numbers
			array = exercise.randomNumbers();

			// Ordered random numbers
			exercise.printArray(array);


			int multipleBy7 = exercise.multipleBy7(array);

			// Output -> "Multiples of 7 present in the array of random numbers"

			JOptionPane.showMessageDialog(null, "Array Numbers multiple by 7: " + multipleBy7);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
