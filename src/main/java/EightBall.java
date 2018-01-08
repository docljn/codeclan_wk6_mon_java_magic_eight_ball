import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EightBall {

    private ArrayList<String> answers;


    public EightBall(List<String> answer_list){

        this.answers = new ArrayList<String>(Arrays.asList(answer_list));
//        this.answers = new ArrayList<>();
//        this.answers.addAll(answers);
        answers.add("Perhaps...");
        answers.add("It could be.");
        answers.add("Most decidedly so!");
    }

    public String getAnswer(){
        Collections.shuffle(answers);
        return this.answers.get(0);
    }


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
