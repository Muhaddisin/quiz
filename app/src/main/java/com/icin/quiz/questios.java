package com.icin.quiz;

import java.util.SplittableRandom;

public class questios {

    private String mQuestions[] = {
            "Lengkapilah suara buaya di bawah ini?",
            "Lengkapilah suara ",
            "Lengkapilah suara buaya di  ini?",
            "Lengkapilah  buaya di bawah ini?",
            "apa"

    };

    private  String mChoices[][]= {
            {"AKU", "B", "C", "D"},
            {"A", "B", "CIWI", "D"},
            {"A", "B", "C", "Dewi"},
            {"Alex", "B", "C", "D"},
            {"a", "Budi", "C", "D"}
    };

    private String mCorrectAnswer[] = {
            "AKU", "CIWI", "Dewi", "Alex","Budi"
    };

    public int getLength(){
        return mQuestions.length;
    }

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0 = mChoices[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
    
}
