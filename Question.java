package org.launchcode.java.studios.QuizTime;

/**
 *
 */
public abstract class Question {

    private String question;
    private Boolean isCorrect;
    private String inputType;
    private String answerChoices;
    private String correctAnswer;
    private String selectedAnswer;

    public Question() {
        System.out.println("in Quesiton constructor");
    }

    public void displayQuestion(){

    }

    public void displayChoices(){

    }

    public void getAnswerChoice(){

    }

    public void validateAnswer(){

    }
}
