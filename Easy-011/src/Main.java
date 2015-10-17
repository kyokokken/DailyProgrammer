import java.util.Scanner;

/**
 * 
 * @author mario
 *
 * Title: [2/19/2012] Challenge #11 [easy]
 * Text: The program should take three arguments.
 * The first will be a day, the second will be month, and the third will be year. Then,
 * your program should compute the day of the week that date will fall on.
 */
public class Main {
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.run();

	}

	private void run() {
		int day = getDayInput();
		int month = getMonthInput();
		int year = getYearInput();
		String dayOfTheWeek = computeDayOfTheWeek(day, month, year);
		printDayOfTheWeek(dayOfTheWeek);
		
	}

	private void printDayOfTheWeek(String dayOfTheWeek) {
		System.out.println("Day is: " + dayOfTheWeek);
		
	}

	private String computeDayOfTheWeek(int day, int month, int year) {
		int i = (day + monthNumber(month, isLeapYear(year)) + lastTwoDigits(year) + lastTwoDigits(year)/4 + centuryNumber(year)) % 7;
		switch (i) {
		case 0:
			return "Saturday";
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		default:
			return "What?";
		}
	}
	
	private int lastTwoDigits(int year) {
		return year % 100;
	}

	private boolean isLeapYear(int year) {
		if (year % 4 == 0)
		{
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				else return false;
			}
			else return true;
		}
		else return false;
	}

	private int monthNumber(int month, boolean isLeapYear) {
		switch(month)
		{
		case 1:
			if (isLeapYear)
				return 6;
			else
				return 0;
		case 2:
			if (isLeapYear)
				return 2;
			else
				return 3;
		case 3:
			return 3;
		case 4:
			return 6;
		case 5:
			return 1;
		case 6:
			return 4;
		case 7:
			return 6;
		case 8:
			return 2;
		case 9:
			return 5;
		case 10:
			return 0;
		case 11:
			return 3;
		case 12:
			return 5;
		default:
			return -9999999;
		}
	}

	private int centuryNumber(int year) {
		int century = year / 100;
		switch (century % 4) {
		case 0:
			return 0;
		case 1:
			return 5;
		case 2:
			return 3;
		case 3:
			return 1;
		default:
			return -99999999;
		}
	}

	private int getYearInput() {
		System.out.println("Insert year:");
		return Integer.parseInt(in.nextLine());
	}

	private int getMonthInput() {
		System.out.println("Insert month:");
		return Integer.parseInt(in.nextLine());
	}

	private int getDayInput() {
		System.out.println("Insert day:");
		return Integer.parseInt(in.nextLine());
	}

}
