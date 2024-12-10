package bookExercises;

public class Ex79methods {

	public int[] randomNumbers() {

		int[] array = new int[30];

		int randomNumber = 0;

		for (int i = 0; i < array.length; i++) {

			randomNumber = (int) Math.round(randomNumber);

			randomNumber = (int) (Math.random() * 100);

			array[i] = randomNumber;

		}

		return array;

	}

	public void printArray(int[] array) {

		int swap;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					swap = array[i];

					array[i] = array[j];

					array[j] = swap;
				}

			}
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		System.out.println();
	}

	public int multipleBy7(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 7 == 0) {

				count++;
			}
		}

		return count;

	}

}
