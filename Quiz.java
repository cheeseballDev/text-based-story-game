
import java.util.List;

public class Quiz implements QuizFunctions {
    private String cuisine;
    private String step;
    private List<String> choices;
    private String correctAnswer;

    public String getCuisine() {
        return this.cuisine;
    }

    public String getStep() {
        return this.step;
    }

    public List<String> getChoices() {
        return this.choices;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    public String changeToString() {
        return cuisine + step + "\nChoices" + String.join("", choices);
    }

    public Quiz(String cuisine, String step, List<String> choices,  String correctAnswer) {
        this.cuisine = cuisine;
        this.step = step;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }
}

