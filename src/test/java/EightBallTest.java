import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall eightBall;
    ArrayList<String> answers;

    @Before

    public void before(){
        answers = new ArrayList<>();
        answers.add("Perhaps...");
        answers.add("It could be.");
        answers.add("Most decidedly so!");
        eightBall = new EightBall(answers);
    }

    @Test
    public void testDummyMethod(){
        assertEquals(0, 0);
    }

    @Test
    public void canAddAnswer(){
        eightBall.addAnswer("Signs tend towards the negative.");
        assertEquals(4, eightBall.getNumberOfAnswers());
    }

    @Test
    public void canDeleteAnswer(){
        eightBall.deleteAnswer("Perhaps...");
        assertEquals(2, eightBall.getNumberOfAnswers());
    }



}
