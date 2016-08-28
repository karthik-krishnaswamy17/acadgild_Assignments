/**
 * Program to print the characters corresponding to ASCII codes from 65 to 90 in a tabular format like:
*65-A
*66-B
*/
package day1.acadgild.com;

public class printASCII {
	private static int initialASCII = 65, finalASCII = 90;

	public static void main(String[] args) {
		System.out.println("ASCII CODES\n");

		for (int i = initialASCII; i <= finalASCII; i++) {

			System.out.println(i + "-" + (char) i);
		}
	}

}
