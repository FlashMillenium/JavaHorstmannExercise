import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.SyncFailedException;

import static org.junit.Assert.*;


public class ExerciseOneTest {

    public final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
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


}