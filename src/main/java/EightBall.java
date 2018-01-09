import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EightBall {

    private ArrayList<String> answers;


    public EightBall(ArrayList<String> answers){

        this.answers = new ArrayList<String>(answers);

    }

    public String getAnswer(){
        Collections.shuffle(answers);
        return this.answers.get(0);
    }

//    if you create a getAnswers getter, you need to create a copy of the
//    answers ArrayList before returning the contents of that copy.


    public int getNumberOfAnswers() {
        return this.answers.size();
    }

    public void addAnswer(String newAnswer) {
        this.answers.add(newAnswer);
    }

    public void deleteAnswer(String answer) {
        this.answers.remove(answer);
    }
}
