/**
 * 
 * @author mario
 *
 * Title: [2/16/2012] Challenge #8 [easy]
 * Text: write a program that will print the song "99 bottles of beer on the wall".
 * for extra credit, do not allow the program to print each loop on a new line.
 */
public class Main {
	public static void main(String[] args) {
		int bottles = 99;
		for (int i = bottles; i > 2; i--)
		{
			System.out.format("%d bottles of beer on the wall, %d bottles of beer.\n", i, i);
			System.out.format("Take one down and pass it around, %d bottles of beer on the wall.\n\n", i-1);
		}
		System.out.print("2 bottles of beer on the wall, 2 bottles of beer.\n");
		System.out.print("Take one down and pass it around, 1 bottle of beer on the wall.\n\n");
		
		System.out.print("1 bottle of beer on the wall, 1 bottle of beer.\n");
		System.out.print("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
		
		System.out.print("No more bottles of beer on the wall, no more bottles of beer.\n"); 
		System.out.print("Go to the store and buy some more, 99 bottles of beer on the wall.\n");
	}

}
