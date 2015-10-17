import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author mario
 *
 *         Title: [2/23/2012] Challenge #14 [easy] Text: Input: list of elements
 *         and a block size k or some other variable of your choice Output:
 *         return the list of elements with every block of k elements reversed,
 *         starting from the beginning of the list. For instance, given the list
 *         12, 24, 32, 44, 55, 66 and the block size 2, the result is 24, 12,
 *         44, 32, 66, 55.
 */

public class Main {
	Scanner in = new Scanner(System.in);

	public static void main(String args[]) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		ArrayList<String> elements = getElements();
		int blockSize = getBlockSize();
		ArrayList<String> elementsReversed = reversePerBlockSize(elements, blockSize);
		printReversedElements(elementsReversed);

	}

	private void printReversedElements(ArrayList<String> elementsReversed) {
		System.out.println("Reversed list:");
		for (String s : elementsReversed)
			System.out.print(s + " ");
		
	}

	private ArrayList<String> reversePerBlockSize(ArrayList<String> elements, int blockSize) {
		int i = 0;
		ArrayList<String> partial = new ArrayList<String>();
		while (i < elements.size()) {
			for (int j = blockSize - 1; j >= 0; j--) {
				// This is for make sure that the reverse works even for blocksize not multiple of elements' array length.
				j = Math.min((elements.size() - i - 1), j);
				String string = elements.get(i + j);
				partial.add(string);
			}
			i += blockSize;
		}
		return partial;
	}

	private int getBlockSize() {
		System.out.println("Insert block size:");
		return Integer.parseInt(in.nextLine());
	}

	private ArrayList<String> getElements() {
		ArrayList<String> elements = new ArrayList<String>();
		String input;
		do {
			System.out.println("Insert next element (-1 for end):");
			input = in.nextLine();
			elements.add(input);
		} while (!input.equals("-1"));
		elements.remove("-1");
		return elements;
	}

}
