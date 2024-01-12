package org.funwithquizzes;

// Abstract base class for all question types
public abstract class Question {
    protected String questionText; // Store the text of the question
    // Constructor to initialize the question text
    public Question(String questionText) {
        this.questionText = questionText;
    }
    // Abstract Method to display the question --Implemented by subclass
    public abstract void displayQuestion();
    // Abstract Method to check if the answer is correct --Implemented by subclass
    public abstract boolean checkAnswer(String userAnswer);
}
