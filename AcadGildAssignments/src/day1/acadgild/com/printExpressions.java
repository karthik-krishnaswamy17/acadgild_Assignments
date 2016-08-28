/**
 * 
 * @author karthik90
 *Program to print the below expression:
 *int b= a-- - --a;
 *int c=a--;
 *int d=a>>2;
 *int e=a&b;
 */

package day1.acadgild.com;

public class printExpressions {

	public static void main(String[] args) {
		int a = 20, b = 10, c, d, e;
		b = (a--) - (--a);
		c = a--;
		d = a >> 2;
		e = a & b;
		System.out.println("A: " + a + " B:" + b + " C:" + c + " D:" + d);
	}

}
