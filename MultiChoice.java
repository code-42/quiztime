package org.launchcode.java.studios.QuizTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Inspired by LaunchCode
 * Edited by Edward Dupre on 3/20/17.
 */
class MultiChoice extends Question {

    int numberOfAnswers;

    public MultiChoice() {
        System.out.println("in multiChoice = ");
        MultiChoice mc1 = new MultiChoice();
        mc1.makeQuestion();
    }

    private void validateMC(){

    }

    public static void makeQuestion(){
        Map<String, List<String>> questions = new HashMap<String, List<String>>();
        ArrayList<String> choices = new ArrayList<>();

        questions.put("1. What Java keyword creates inheritance?", choices);

        choices.add("enlarge");
        choices.add("extends");
        choices.add("inherits");
        choices.add("inheritance");

        for(Map.Entry<String, List<String>> e : questions.entrySet()){
            System.out.println("question: " + e.getKey());
            for (String o : e.getValue()){
                System.out.println("choices: " + o);
            }
        }
    }
}
