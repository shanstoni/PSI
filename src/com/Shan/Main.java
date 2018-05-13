package com.Shan;

public class Main extends Questions{

    public static void main(String[] args) {

        ResultArray resultArray = new ResultArray();
        Questions questions = new Questions();

        questions.questions();
        resultArray.findMaxValue();
        resultArray.collectAnswers();
        questions.finalAnswer();
    }
}
