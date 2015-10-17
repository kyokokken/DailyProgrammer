import java.util.HashMap;

/**
 * 
 * @author mario
 *
 * Title: [2/15/2012] Challenge #7 [easy]
 * Text: Write a program that can translate Morse code in the format of ...---...
 * A space and a slash will be placed between words. ..- / --.-
 * For bonus, add the capability of going from a string to Morse code.
 * Super-bonus if your program can flash or beep the Morse.
 * This is your Morse to translate:
 * .... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--
 */
public class Main {
	
	String morseCode = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
	private HashMap<String, Character> morseToLetter;

	public static void main(String[] args) {
		Main main = new Main();
		main.run();

	}
	
	public void run() {
		init();
		
		StringBuilder result = new StringBuilder();
		
		String[] words = morseCode.split(" / ");
		for (String word : words)
		{
			String[] letters = word.split(" ");
			for (String letter : letters) {
				Character c = morseToLetter.get(letter);
				result.append(c);
			}
			result.append(" ");
		}
		System.out.println(result.toString());
	}

	private void init() {
		buildMorseAlphabet();
		
		
	}

	private void buildMorseAlphabet() {
		morseToLetter = new HashMap<String, Character>();
		morseToLetter.put(".-", 'A');
		morseToLetter.put("-...", 'B');
		morseToLetter.put("-.-.", 'C');
		morseToLetter.put("-..", 'D');
		morseToLetter.put(".", 'E');
		morseToLetter.put("..-.", 'F');
		morseToLetter.put("--.", 'G');
		morseToLetter.put("....", 'H');
		morseToLetter.put("..", 'I');
		morseToLetter.put(".---", 'J');
		morseToLetter.put("-.-", 'K');
		morseToLetter.put(".-..", 'L');
		morseToLetter.put("--", 'M');
		morseToLetter.put("-.", 'N');
		morseToLetter.put("---", 'O');
		morseToLetter.put(".--.", 'P');
		morseToLetter.put("--.-", 'Q');
		morseToLetter.put(".-.", 'R');
		morseToLetter.put("...", 'S');
		morseToLetter.put("-", 'T');
		morseToLetter.put("..-", 'U');
		morseToLetter.put("...-", 'V');
		morseToLetter.put(".--", 'W');
		morseToLetter.put("-..-", 'X');
		morseToLetter.put("-.--", 'Y');
		morseToLetter.put("--..", 'Z');
		morseToLetter.put("-----", '0');
		morseToLetter.put(".----", '1');
		morseToLetter.put("..---", '2');
		morseToLetter.put("...--", '3');
		morseToLetter.put("....-", '4');
		morseToLetter.put(".....", '5');
		morseToLetter.put("-....", '6');
		morseToLetter.put("--...", '7');
		morseToLetter.put("---..", '8');
		morseToLetter.put("----.", '9');
	}

}
