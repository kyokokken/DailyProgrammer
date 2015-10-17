import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author mario
 *
 * Title: [2/12/2012] Challenge #4 [easy]
 * Text: You're challenge for today is to create a random password generator!
 * For extra credit, allow the user to specify the amount of passwords to generate.
 * For even more extra credit, allow the user to specify the length of the strings he wants to generate!
 */
public class Main {

	String allowedChars = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		int nPasswords = getAmountOfPasswords();
		int passwordLength = getSizeOfString();
		String[] passwords = generatePasswords(nPasswords, passwordLength);
		printPasswords(passwords);
	}

	private void printPasswords(String[] passwords) {
		System.out.println("Password List:");
		for (String p : passwords) {
			System.out.println(p);
		}
		
	}

	private String[] generatePasswords(int nPasswords, int passwordLength) {
		String[] passwords = new String[nPasswords];
		for (int i = 0; i < nPasswords; i++) {
			StringBuilder pw = new StringBuilder();
			for (int j = 0; j < passwordLength; j++) {
				int nextInt = random.nextInt(allowedChars.length());
				pw.append(allowedChars.charAt(nextInt));
			}
			passwords[i] = pw.toString();
		}
		return passwords;
	}

	private int getSizeOfString() {
		System.out.println("Password length:");
		String input = scanner.nextLine();
		int passwordLength = Integer.parseInt(input);
		return passwordLength;
	}

	private int getAmountOfPasswords() {
		System.out.println("Amount of passwords:");
		String input = scanner.nextLine();
		int nPasswords = Integer.parseInt(input);
		return nPasswords;
	}

}
