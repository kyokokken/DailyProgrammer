import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author mario
 *
 *         Title: [2/17/2012] Challenge #9 [easy] Text: write a program that
 *         will allow the user to input digits, and arrange them in numerical
 *         order. for extra credit, have it also arrange strings in alphabetical
 *         order
 */
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();

	}

	private void run() {
		ArrayList<Integer> input = takeInput();
		ArrayList<Integer> sortedInput = sortIntegers(input);
		printSortedInput(sortedInput);
	}

	private void printSortedInput(ArrayList<Integer> sortedInput) {
		System.out.println("Sorted List:");
		for (Integer i : sortedInput)
			System.out.format("%d ", i);

	}

	private ArrayList<Integer> sortIntegers(ArrayList<Integer> input) {
		ArrayList<Integer> output = (ArrayList<Integer>) input.clone();
		Collections.sort(output);
		return output;
	}

	private ArrayList<Integer> takeInput() {
		ArrayList<Integer> result = new ArrayList<Integer>();

		try (Scanner in = new Scanner(System.in)) {
			while (true) {
				System.out.println("Input an integer, (-1 for end):");
				String nextLine = in.nextLine();
				int inputInt = Integer.parseInt(nextLine);
				if (inputInt != -1)
					result.add(inputInt);
				else
					return result;
			}
		}
	}
}
