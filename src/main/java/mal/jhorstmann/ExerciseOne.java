package mal.jhorstmann;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Random;
import java.util.regex.Matcher;

import static java.lang.Math.abs;

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
    public static int maxInt(int i1, int i2, int i3){
        int maxi;
         //maxi = i1 > i2 ? (i1 > i3 ? i1 : i3) : (i2 > i3 ? i2 : i3);
        maxi=Math.max(i1,Math.max(i2,i3));
        return maxi;
    }
    /*
       Write a program that computes the factorial n! = 1 x 2 x ... n, using
       BigInteger. Compute the factorial of 1000.
     */
    public static BigInteger factorial(int count){
        BigInteger result = new BigInteger("1");
        for(int i = count; i>1; i--)
           result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
    /*
       Write a program that reads in two numbers between 0 and 65535,
       stores them in short variables, and computers their unsigned sum,
       difference, product, quotient, and remainder, without converting them to int.
     */
    public static short[] shortCompute(short one, short two){
        short[] result = new short[5];

        result[0] = (short)(Short.toUnsignedInt(one) + Short.toUnsignedInt(two));
        result[1] = (short)(Short.toUnsignedInt(one) - Short.toUnsignedInt(two));
        result[2] = (short)(Short.toUnsignedInt(one) * Short.toUnsignedInt(two));
        result[3] = (short)(Short.toUnsignedInt(one) / Short.toUnsignedInt(two));
        result[4] = (short)(Short.toUnsignedInt(one)%Short.toUnsignedInt(two));
        return result;
    }
    /*
       Write a program that produces a random string of letters and digits by generating
       a random long value and printing it in base 36.
     */
     public static String randString(int length){
         StringBuilder result = new StringBuilder(length);
         Random rGenerator = new Random(System.currentTimeMillis());
         for(int i = 0; i<length; i++){
             int c = (int)abs(rGenerator.nextLong()%36);
             //System.out.print(c + " ");
             if(c<26) c+=97;
             else     c+=48-26;
             result.append((char)c);
         }
        return result.toString();
     }

    /*
       Write a program that stores Pascal's triangle up to a given n in an
       ArrayList<ArrayList<Integer>>.
     */

    public static ArrayList<ArrayList<Integer>> trianglePascale(int n){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<n; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) row.add(1);
                else row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            result.add(i,row);
        }
        return result;
    }

    /*
       Improve the average method so that it is called with at least one parameter.
     */
    public static double average(double firstValue, double... values){
        double sum = firstValue;
        for (double v: values){ sum +=v; }
        System.out.println(values.length);
        return values.length == 0 ? sum : BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(values.length+1),10, RoundingMode.HALF_UP).doubleValue();


    }

    public static void  main(String [] args){


    }
}
