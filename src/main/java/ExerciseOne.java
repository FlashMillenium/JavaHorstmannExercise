
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

    public static void main(String [] args){
        printInt(10);
    }
}
