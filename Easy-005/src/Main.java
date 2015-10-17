import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 
 * @author mario
 *
 * Title: [2/12/2012] Challenge #5 [easy]
 * Text: Your challenge for today is to create a program which is password protected, and wont open unless the correct user and
 * password is given.
 * For extra credit, have the user and password in a seperate .txt file.
 * for even more extra credit, break into your own program :)
 */
public class Main {

	String user;
	String password;
	boolean loginSuccessful;
	
	Scanner scanner;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.run();

	}
	
	public void run() {
		init();
		while (!loginSuccessful) {
			loginSuccessful = tryLogin();
			if (!loginSuccessful) {
				System.out.println("Try again.");
			}
		}
		System.out.format("Welcome %s!", user);
	}

	private boolean tryLogin() {
		System.out.println("User:");
		String user = scanner.nextLine();
		System.out.println("Password:");
		String password = scanner.nextLine();
		
		if (user.equals(this.user) && password.equals(this.password))
			return true;
		else return false;
	}

	private void init() {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("pass.txt"))) {
			user = reader.readLine();
			password = reader.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginSuccessful = false;
		scanner = new Scanner(System.in);
	}

}
