package com.example.english_qaida_and_quiz_app_mc_assignment;

public class quiz {
    private String q, q1, q2, q3;
    private int correct;

    public quiz(String q1, String q2, String q3, int correct){
        this.q1=q1;
        this.q2=q2;
        this.q3=q3;
        this.correct=correct;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }
}
