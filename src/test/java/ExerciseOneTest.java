import mal.jhorstmann.ExerciseOne;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    public void printInt() throws Exception {
        ExerciseOne.printInt(10);
        assertEquals("1010 12 a 0X1.999AP-4",outContent.toString());
    }

    @Test
    public void getNegativeAngle() throws Exception {
        final int negativeAngle = -250;
        final int expectedValue = 110;
        int actualValue;
        actualValue = ExerciseOne.getAngle(negativeAngle);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void getExcessAngle() throws Exception {
        final int excessAngle = 1000;
        final int expectedValue = 280;
        int actualValue;
        actualValue = ExerciseOne.getAngle(excessAngle);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void getAngle() throws Exception {
        final int angle = 90;
        final int expectedValue = 90;
        int actualValue;
        actualValue = ExerciseOne.getAngle(angle);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void maxInt() throws Exception {
        final int intMax = 100, intmin1 = 50, intmin2 = 50;
        final int expectedValue = 100, actualValue;
        actualValue = ExerciseOne.maxInt(intmin1, intMax, intmin2);
        assertEquals(expectedValue,actualValue);
    }

}