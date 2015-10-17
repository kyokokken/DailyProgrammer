import java.util.Scanner;

/**
 * 
 * @author mario
 * 
 * Title: [2/11/2012] Challenge #3 [easy]
 * Text: Welcome to cipher day!
 * write a program that can encrypt texts with an alphabetical caesar cipher. This cipher can ignore numbers, symbols, and whitespace.
 * for extra credit, add a "decrypt" function to your program!
 */
public class Main {
	Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		String input = getInputString();
		int offset = getOffset();
		String encrypted = encryptString(input, offset);
		System.out.println("Encrypted String: " + encrypted);
		
	}

	private int getOffset() {
		System.out.println("Enter offset:");
		String inputOffset = scanner.nextLine();
		return Integer.parseInt(inputOffset);
	}

	private String encryptString(String input, int offset) {
		offset = offset % 26;
		StringBuffer str = new StringBuffer();
		for (char c : input.toCharArray()) {
			str.append((char)(c+offset));
		}
		return str.toString();
		
	}

	private String getInputString() {
		System.out.println("Enter string to encrypt:");
		String inputString = scanner.nextLine();
		return inputString;
	}

}
