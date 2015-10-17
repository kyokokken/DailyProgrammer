import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author mario
 *
 * Title: [2/21/2012] Challenge #13 [easy]
 * Text: Find the number of the year for the given date.
 * For example, january 1st would be 1, and december 31st is 365.
 * ---
 * 1st 2nd 3rd 4th 5th 6th ... 9th 10th 11th
 */
public class Main {
	
	String[] months = { "january", "february", "march", "april", "may", "june",
						"july", "august", "september", "october", "november", "december" };

	int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		String dateString = getInputDate();
		int month = parseMonth(dateString);
		int day = parseDay(dateString);
		int numberOfYear = calculateNumberOfYear(day, month);
		printNumberOfYear(numberOfYear);
	}

	private void printNumberOfYear(int numberOfYear) {
		System.out.println("The number of year is: " + numberOfYear);
	}

	private int calculateNumberOfYear(int day, int month) {
		int numberOfYear = 0;
		for (int i = 1; i < month; i++)
		{
			numberOfYear += daysInMonths[i-1];
		}
		numberOfYear += day;
		return numberOfYear;
	}

	private int parseMonth(String dateString) {
		String[] inputSplit = dateString.split(" ");
		String monthString = inputSplit[0];
		for (int i = 0; i < months.length; i++)
			if (months[i].equals(monthString))
				return i+1;
		return 0;
	}

	private int parseDay(String dateString) {
		String[] inputSplit = dateString.split(" ");
		String dayString = inputSplit[1];
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(dayString);
		if (matcher.find())
			return Integer.parseInt(matcher.group());
		else
			return 0;
	}

	private String getInputDate() {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert a valid date:");
		String input = in.nextLine();
		return input;
	}

}
