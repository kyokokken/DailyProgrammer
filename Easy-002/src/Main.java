import java.util.Scanner;

/**
 * 
 * @author mario
 *
 * Title: [easy] challenge #2
 * Text: Hello, coders! An important part of programming is being able to apply your programs,
 * so your challenge for today is to create
 * a calculator application that has use in your life.
 * It might be an interest calculator, or it might be something that you can use in the
 * classroom. For example, if you were in physics class, you might want to make a F = M * A calc.
 * EXTRA CREDIT: make the calculator have multiple functions! Not only should it be able to calculate F = M * A,
 * but also A = F/M, and M = F/A!
 */
public class Main {

	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		String input;
		do {
			input = askSolvingFormula();	
		} while (isNotInRange(input));
		switch (input) {
			case "1":
				solveForF();
				break;
			case "2":
				solveForM();
				break;
			case "3":
				solveForA();
				break;
			default:
				// Shouldn't be never here
		}		
	}

	private void solveForA() {
		System.out.println("Value of F:");
		String nextLine = scanner.nextLine();
		double f = Double.parseDouble(nextLine);
		System.out.println("Value of M:");
		nextLine = scanner.nextLine();
		double m = Double.parseDouble(nextLine);
		double a = f / m;
		System.out.println("A is: " + a);
	}

	private void solveForM() {
		System.out.println("Value of F:");
		String nextLine = scanner.nextLine();
		double f = Double.parseDouble(nextLine);
		System.out.println("Value of A:");
		nextLine = scanner.nextLine();
		double a = Double.parseDouble(nextLine);
		double m = f / a;
		System.out.println("M is: " + m);
	}

	private void solveForF() {
		System.out.println("Value of M:");
		String nextLine = scanner.nextLine();
		double m = Double.parseDouble(nextLine);
		System.out.println("Value of A:");
		nextLine = scanner.nextLine();
		double a = Double.parseDouble(nextLine);
		double f = m * a;
		System.out.println("F is: " + f);
	}

	private boolean isNotInRange(String input) {
		return !input.equals("1") && !input.equals("2") && !input.equals("3");
	}

	private String askSolvingFormula() {
		System.out.println("Which one do you want to find?");
		System.out.println("1. F");
		System.out.println("2. M");
		System.out.println("3. A");
		String input = scanner.nextLine();
		return input;
	}

}
