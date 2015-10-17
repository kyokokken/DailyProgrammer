import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author mario
 *
 *         Title: [2/20/2012] Challenge #12 [easy] Text: Write a small program
 *         that can take a string: "hi!" and print all the possible permutations
 *         of the string: "hi!" "ih!" "!hi" "h!i" "i!h" etc...
 */
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		String input = getInputString();
		ArrayList<String> permutations = makePermutations(input);
		printPermutations(permutations);
	}

	private void printPermutations(ArrayList<String> permutations) {
		System.out.println("Permutation list (" + permutations.size() + "):");
		for (String s : permutations) {
			System.out.format("%s ", s);
		}
		
	}

	private ArrayList<String> makePermutations(String input) {
		ArrayList<String> result = new ArrayList<>();
		if (input.length() <= 1) {
			result.add(input);
			return result;
		} else {
			for (int i = 0; i < input.length(); i++) {
				char first = input.charAt(i);
				String rest = input.substring(0, i) + input.substring(i + 1);
				ArrayList<String> restPerm = makePermutations(rest);
				for (String s : restPerm) {
					result.add(first + s);
				}
			}
		}
		return result;
	}

	private String getInputString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert a string:");
		return scanner.nextLine();
	}

}
