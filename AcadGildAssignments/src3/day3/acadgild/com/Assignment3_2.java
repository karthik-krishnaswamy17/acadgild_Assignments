/*
 * Write a Java statement to assign the value true to the boolean variable same , 
 * when the String variable S1 has the same contents as the String variable S2 , and false otherwise.
 */
package day3.acadgild.com;

public class Assignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean same;
		String s1 = "Tom", s2 = "Harry";
		if (s1.equals(s2))
			same = true;
		else
			same = false;

		System.out.println("value of Same Variable:" + same);
	}

}
