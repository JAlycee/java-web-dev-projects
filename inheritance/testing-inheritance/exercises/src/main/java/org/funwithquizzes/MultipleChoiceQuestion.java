package org.funwithquizzes;
import java.util.List;
public class MultipleChoiceQuestion extends Question {
    private List<String> options;

    public MultipleChoiceQuestion(String questionText, List<String> options) {
        super(questionText);
        this.options = options;
    }

    @Override
    public void displayQuestion() {
        System.outprintln(questionText);
        char optionLabel = 'a';
        for (String option : options) {
            System.out.println(optionLabel + ") " + option);
            optionLabel++;
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return true; //Placeholder
    }
}
