package org.launchcode.java.studios.QuizTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Inspired by LaunchCode
 * Edited by Edward Dupre on 3/20/17.
 */
public class TrueFalse extends Question {

    int numberOfAnswers;

    private void validateTF(){

    }

    public TrueFalse() {
//        super(multiChoice);
        System.out.println("inside TrueFalse");
        Map<String, List<String>> questions = new HashMap<String, List<String>>();
        ArrayList<String> choices = new ArrayList<>();

        questions.put("Eggs grow on Eggplants.", choices);

        choices.add("True");
        choices.add("False");

        for (Map.Entry<String, List<String>> e : questions.entrySet()) {
            System.out.println("question: " + e.getKey());
            for (String o : e.getValue()) {
                System.out.println("choices: " + o);
            }
        }
    }
}
