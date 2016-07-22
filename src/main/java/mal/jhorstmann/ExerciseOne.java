package mal.jhorstmann;


public class ExerciseOne {

    /*
      Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
      Print the reciprocal as a hexadecimal floating-point number.
     */
    public static void printInt(int i){
        System.out.printf("%s %s %s %8.4A",
                Integer.toString(i,2),
                Integer.toString(i,8),
                Integer.toString(i,16), 1.0 /i);
    }

    /*
       Write a program that reads an integer angle (which may be positive or negative) and
       normalizes it to a value between 0 and 359 degrees. Try it first with the % operator,
       then with floorMod.
     */
    public static int getAngle(final int i){
        int angle;
        final int fullAngle = 360;
        angle = i < 0 ? fullAngle + i : i;
        //angle = angle%fullAngle;
        angle = Math.floorMod(angle,fullAngle);
        return angle;
    }
    /*
       Using only the conditional operator, write a program that reads three integers and
       print the largest. Repeat with Math.max.
     */

    /*
       Write a program that prints the smallest and largest positive double value.
       Hint: Look up Math.nextUp in the Java API.
     */

    /*
       Write a program that computes the factorial n! = 1 x 2 x ... n, using
       BigInteger. Compute the factorial of 1000.
     */

    /*
       Write a program that reads in two numbers between 0 and 65535,
       stores them in short variables, and computers their unsigned sum,
       difference, product, quotient, and remainder, without converting them to int.
     */

    /*
       Write a program that reads a string and print all of its nonempty substring.
     */

    /*
       Write a program that produces a random string of letters amd digits by generating
       a random long value and printing it in base 36.
     */

    /*
       Write a program that reads a line of text and prints all characters
       that are not ASCII, together with their Unicode values.
     */

    /*
       Write a program that prints a lottery combination, picking six distinct
       numbers between 1 and 49. To pick six distinct number, start with an array list
       filled with 1...49. To pick six distinct numbers, start with an array list filled with 1...49.
       Pick a random index and remove the element. Repeat six times. Print the result in sorted order.
     */

    /*
       Write a program that reads a two-dimensional array of integers and determines whether it is
       a magic square (that is, whether the sum of all rows, all columns, and the diagonals is the same).
       Accept lines of input that you break up into individual integers, and stop when the user enters
       a blank line. For example, with the input:
       16  3  2 13
        3 10 11  8
        9  6  7 12
        4 15 14  1
        (blank line)
        you program should respond affirmatively.
     */

    /*
       Write a program that stores Pascal's triangle up to a given n in an
       ArrayList<ArrayList<Integer>>.
     */

    /*
       Improve the average method so that it is called with at least one parameter.
     */


    public static void   main(String [] args){
        printInt(10);
    }
}
