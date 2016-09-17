package day3.acadgild.com;

/**
 * What will the below o/p if the program is compiled and run. 
 * Output must be one of the following:
a. Compiler error.
b. Will throw a NoSuchMethod error at runtime.
c. It will compile and run printing out "10“
d. It will run with no output.
e. It will run and print "10" and then crash with an error
 *
 */

/**
 * 
 * Answer: will throw a NoSuchMethod error at runtime since the there is no main method defined.
 *
 */
public class Assignment3_1 {
	  static{
		print(10);
		}
		static void print (int x) {
		System.out.println (x);
		System.exit(0);
		}

}
