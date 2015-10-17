import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author mario
 *
 * Title: [2/18/2012] Challenge #10 [easy]
 * Text: The exercise today asks you to validate a telephone number, as if written on an input form.
 * Telephone numbers can be written
 * as ten digits, or with dashes, spaces, or dots between the three segments,
 * or with the area code parenthesized; both the area code
 * and any white space between segments are optional.
 * Thus, all of the following are valid telephone numbers:
 * 1234567890, 123-456-7890, 123.456.7890, (123)456-7890, (123) 456-7890
 * (note the white space following the area code), and 456-7890.
 * The following are not valid telephone numbers: 123-45-6789, 123:4567890, and 123/456-7890.
 */
public class Main {

	public static void main(String[] args) {
		
		String[] regexPatterns = { 	"^\\d{10}$",
									"^\\d{3}-\\d{3}-\\d{4}$",
									"^\\d{3}\\.\\d{3}\\.\\d{4}$",
									"^\\(\\d{3}\\)\\d{3}-\\d{4}$",
									"^\\(\\d{3} \\d{3}-\\d{4}$",
									"^\\d{3}-\\d{4}$"};
		
		System.out.println("Insert the telephone number:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		boolean isCorrectTelephone = false;
		
		for (String s : regexPatterns) {
			Pattern pattern = Pattern.compile(s);
			Matcher matcher = pattern.matcher(input);
			if (matcher.find())
			{
				isCorrectTelephone = true;
				System.out.println(s);
			}
		}
		
		if (isCorrectTelephone)
			System.out.format("%s is a correct telephone format", input);
		else
			System.out.format("%s is an invalid telephone number", input);
		
		 

	}

}
