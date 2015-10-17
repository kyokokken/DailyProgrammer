import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 
 * @author mario
 * Easy-001
 * 
 * Title: [easy] challenge #1
 * Text: create a program that will ask the users name, age, and reddit username.
 * have it tell them the information back, in the format:
 *
 * your name is (blank), you are (blank) years old, and your username is (blank)
 *
 * for extra credit, have the program log this information in a file to be accessed later.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main program = new Main();
		program.start();
	}

	private void start() {
		Info info = askInfo();
		logInfo(info);
		printInfo(info);
		
	}

	private void logInfo(Info info) {
		// TODO Auto-generated method stub
		Path path = Paths.get("Easy-001.log");
		System.out.println("Absolute path: " + path.toAbsolutePath());
		
	}

	private void printInfo(Info info) {
		System.out.println("your name is " + info.name +
							", you are " + info.age + " years old, " +
							"and your username is " + info.redditUsername);
	}

	private Info askInfo() {
		Info info = new Info();
		Scanner in = new Scanner(System.in);
		System.out.println("Your name?");
		info.name = in.nextLine();
		System.out.println("Your age?");
		info.age = in.nextLine();
		System.out.println("Your reddit username?");
		info.redditUsername = in.nextLine();
		in.close();
		return info;
	}

	private class Info {
		public String redditUsername;
		public String age;
		public String name;
		
	}
}
