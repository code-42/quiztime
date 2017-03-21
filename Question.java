package org.launchcode.java.studios.QuizTime;

/**
 * Created by Edward Dupre on 3/18/17.
 */
public abstract class Question {


//    private String multiChoice;
    private String question;
    private Boolean isCorrect;
    private String inputType;
    private String answerChoices;
    private String correctAnswer;
    private String selectedAnswer;

    public Question() {
        System.out.println("in Quesiton constructor");
//        MultiChoice multiChoice = new MultiChoice();
    }

    public void displayQuestion(){

    }

    public void displayChoices(){

    }

    public void getAnswerChoice(){

    }

    public void validateAnswer(){

    }


//    public void setMultiChoice(String newQuestion){
//        multiChoice = newQuestion;
//    }
//
//    public void setCheckBox(String newQuestion){
//        checkBox = newQuestion;
//    }
//
//    public void setTrueFalse(Boolean newQuestion){
//        trueFalse = newQuestion;
//    }

}
