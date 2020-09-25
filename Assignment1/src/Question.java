import java.util.Random;

public class Question {
    private String question; //multiple choice or T/F
    private int type = 0; //1 is multiple choice, 2 is true false, 3 is multiple answers

    public int generateQuestion() {
        Random randomQ = new Random(); //random question, either true/false or multiple choice
        int questionType = randomQ.nextInt(3) + 1;

        if (questionType == 1) { //multiple choice
            type = 1;
            question = "Multiple Choice Question: \nWhich class is the most fun?\nA. CS 1400\nB. CS 2400\nC. CS 3560\nD. CS 4700\nE. CS 4990";
        }
        else if (questionType == 2) { //true/false
            type = 2;
            question = "True or False Question: \nComputer science is a good major?";
        }
        else if (questionType == 3) { //multiple choices
            type = 3;
            question = "Select all that apply: \nWhich programming languages do you know?\nA. Java\nB. C++\nC. Python\nD. JavaScript";
        }
        System.out.println(question);
        System.out.println("----------------------------");
        return type;
    }

    public void setQuestion() { this.question = question; }

    public String getQuestion() { return question; }

    public int getType() { return type; }

}
