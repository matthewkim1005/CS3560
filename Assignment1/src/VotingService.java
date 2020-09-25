import java.io.*;

public class VotingService {
    //outputs the statistics of the poll
    private int aAnswers, bAnswers, cAnswers, dAnswers ,eAnswers = 0;
    private int trueAnswers, falseAnswers = 0;
    final private char correctMCAnswer = 'C'; //can change this to change the answer
    final private boolean correctTFAnswer = true; //can change this to change the answer

    public void voteService(Student[] Class, Question question) {
        if (question.getType() == 1) {
            for (int i = 0; i < Class.length; i++) { //reads the elements from the Student class
                System.out.println("Student " + Class[i].getID() + " answered " + Class[i].getMCAnswer()); //displays the ID and answer
                switch (Class[i].getMCAnswer()) {
                    case 'A':
                        aAnswers++;
                        break;
                    case 'B':
                        bAnswers++;
                        break;
                    case 'C':
                        cAnswers++;
                        break;
                    case 'D':
                        dAnswers++;
                        break;
                    case 'E':
                        eAnswers++;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("----------------------------");
            System.out.println(aAnswers + " Student(s) answered A");
            System.out.println(bAnswers + " Student(s) answered B");
            System.out.println(cAnswers + " Student(s) answered C");
            System.out.println(dAnswers + " Student(s) answered D");
            System.out.println(eAnswers + " Student(s) answered E");
            System.out.println("----------------------------");
            System.out.println("The correct answer is: " + correctMCAnswer);
            switch(correctMCAnswer) {
                case 'A':
                    System.out.println(aAnswers + " Student(s) got the correct answer");
                    break;
                case 'B':
                    System.out.println(bAnswers + " Student(s) got the correct answer");
                    break;
                case 'C':
                    System.out.println(cAnswers + " Student(s) got the correct answer");
                    break;
                case 'D':
                    System.out.println(dAnswers + " Student(s) got the correct answer");
                    break;
                case 'E':
                    System.out.println(eAnswers + " Student(s) got the correct answer");
                    break;
                default:
                    break;
            }
        }
        else if (question.getType() == 2) {
            for (int j = 0; j < Class.length; j++) { //reads the elements from the Student class
                System.out.println("Student " + Class[j].getID() + " answered " + Class[j].getTFAnswer()); //displays the ID and answer
                if (Class[j].getTFAnswer()) {
                    trueAnswers++;
                }
                else {
                    falseAnswers++;
                }
            }
            System.out.println("----------------------------");
            System.out.println(trueAnswers + " Student(s) answered true.");
            System.out.println(falseAnswers + " Student(s) answered false.");
            System.out.println("----------------------------");
            System.out.println("The correct answer is: " + correctTFAnswer);
            if(correctTFAnswer == true)
                System.out.println(trueAnswers + " Student(s) got the correct answer");
            else
                System.out.println(falseAnswers + " Student(s) got the correct answer");
        }
        else if (question.getType() == 3){
            for (int k = 0; k < Class.length; k++) {
                String answer = new String(Class[k].getMultiAnswers());
                System.out.println("Student " + Class[k].getID() + " answered " + answer);
                StringReader stringReader = new StringReader(answer);
                //counts the number of answers each student submitted
                for (int l = 0; l < answer.length(); l++) {
                    switch(answer.charAt(l)) {
                        case 'A':
                            aAnswers++;
                            break;
                        case 'B':
                            bAnswers++;
                            break;
                        case 'C':
                            cAnswers++;
                            break;
                        case 'D':
                            dAnswers++;
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.println("----------------------------");
            System.out.println(aAnswers + " Student(s) know Java");
            System.out.println(bAnswers + " Student(s) know C++");
            System.out.println(cAnswers + " Student(s) know Python");
            System.out.println(dAnswers + " Student(s) know JavaScript");
        }
    }
}
