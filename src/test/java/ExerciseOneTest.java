import mal.jhorstmann.ExerciseOne;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.Assert.*;


public class ExerciseOneTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams(){
        System.setOut(null);
    }

    @Test
    public void testPrintInt() throws Exception {
        ExerciseOne.printInt(10);
        assertEquals("1010 12 a 0X1.999AP-4",outContent.toString());
    }

    @Test
    public void testGetNegativeAngle() throws Exception {
        final int negativeAngle = -250;
        final int expectedValue = 110;
        int actualValue;
        actualValue = ExerciseOne.getAngle(negativeAngle);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testGetExcessAngle() throws Exception {
        final int excessAngle = 1000;
        final int expectedValue = 280;
        int actualValue;
        actualValue = ExerciseOne.getAngle(excessAngle);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testGetAngle() throws Exception {
        final int angle = 90;
        final int expectedValue = 90;
        int actualValue;
        actualValue = ExerciseOne.getAngle(angle);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testMaxInt() throws Exception {
        final int intMax = 100, intmin1 = 50, intmin2 = 50;
        final int expectedValue = 100, actualValue;
        actualValue = ExerciseOne.maxInt(intmin1, intMax, intmin2);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFactorial() throws Exception {
        final BigInteger expectedValue = new BigInteger("15511210043330985984000000");
        final int count = 25;
        final BigInteger actualValue;
        actualValue = ExerciseOne.factorial(count);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testShortCalc(){
        final short s1 = (short)40000, s2 = 300;
        final short[] actualValue = ExerciseOne.shortCompute(s1, s2);
        final short[] expectedValue = new short[5];
        int i1 = 40000, i2 = 300;
        expectedValue[0] = (short)(i1+i2);
        expectedValue[1] = (short)(i1-i2);
        expectedValue[2] = (short)(i1*i2);
        expectedValue[3] = (short)(i1/i2);
        expectedValue[4] = (short)(i1%i2);
        assertArrayEquals(expectedValue,actualValue);
    }

    @Test
    public void testRandomString(){
        final int slength = 42;
        final String Value = ExerciseOne.randString(slength);
        assertEquals(slength,Value.length());
        assertFalse(Value,Value.matches("\\W*"));
    }

    @Test
    public void testPascalTriangle() {
        final int height = 11;
        final int[][] expectedValue = {
                {1},
                {1, 1},
                {1, 2, 1},
                {1, 3, 3, 1},
                {1, 4, 6, 4, 1},
                {1, 5, 10, 10, 5, 1},
                {1, 6, 15, 20, 15, 6, 1},
                {1, 7, 21, 35, 35, 21, 7, 1},
                {1, 8, 28, 56, 70, 56, 28, 8, 1},
                {1, 9, 36, 84, 126, 126, 84, 36, 9, 1},
                {1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1}};

        ArrayList<ArrayList<Integer>> arrayLists = ExerciseOne.trianglePascale(height);
        Integer[][] actualValue = new Integer[arrayLists.size()][];
        for(int i=0; i<arrayLists.size();i++){
            ArrayList<Integer> row = arrayLists.get(i);
            actualValue[i]=row.toArray(new Integer[row.size()]);
        }
        assertArrayEquals(expectedValue,actualValue);
    }
}