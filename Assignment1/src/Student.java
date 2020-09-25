import java.util.Random;

public class Student {
    private String ID = "ID:0000"; //String ID for each student
    private char MCAnswer;
    private boolean TFAnswer;
    private char[] multipleAnswers;

    public int randomID() {
        Random randomID = new Random(); //random ID
        int ranID = randomID.nextInt(9000) + 1000;
        return ranID;
    }
    //generates a random Multiple choice answer
    public char generateMCAnswer() {
        char answer = 'A';
        Random randomChar = new Random(); //random char
        int ranChar = randomChar.nextInt(5);
        switch(ranChar) {
            case 0:
                answer = 'A';
                break;
            case 1:
                answer = 'B';
                break;
            case 2:
                answer = 'C';
                break;
            case 3:
                answer = 'D';
                break;
            case 4:
                answer = 'E';
            break;
            default:
                break;
        }
        return answer;
    }
    //generates a random true or false answer
    public boolean generateTFAnswer() {
        boolean trueFalseAnswer = false;
        Random randomBoolean = new Random();
        int ranBoolean = randomBoolean.nextInt(2);
        switch(ranBoolean) {
            case 0:
                trueFalseAnswer = true;
                break;
            case 1:
                trueFalseAnswer = false;
                break;
            default:
                break;
        }
        return trueFalseAnswer;
    }

    public char[] generateMultipleAnswers() {
        char[] multiAnswers= new char[4];
        Random randomAnswers = new Random();
        int ranAnswers = randomAnswers.nextInt(14);
        //randomizes the number of answer choices
        switch(ranAnswers) {
            case 0:
                multiAnswers[0] = 'A';
                break;
            case 1:
                multiAnswers[0] = 'A';
                multiAnswers[1] = 'B';
                break;
            case 2:
                multiAnswers[0] = 'A';
                multiAnswers[1] = 'B';
                multiAnswers[2] = 'C';
                break;
            case 3:
                multiAnswers[0] = 'A';
                multiAnswers[1] = 'B';
                multiAnswers[2] = 'C';
                multiAnswers[3] = 'D';
                break;
            case 4:
                multiAnswers[0] = 'A';
                multiAnswers[1] = 'C';
                break;
            case 5:
                multiAnswers[0] = 'A';
                multiAnswers[1] = 'D';
                break;
            case 6:
                multiAnswers[0] = 'A';
                multiAnswers[1] = 'C';
                multiAnswers[2] = 'D';
                break;
            case 7:
                multiAnswers[0] = 'B';
                multiAnswers[1] = 'C';
                break;
            case 8:
                multiAnswers[0] = 'B';
                multiAnswers[1] = 'C';
                multiAnswers[2] = 'D';
                break;
            case 9:
                multiAnswers[0] = 'B';
                break;
            case 10:
                multiAnswers[0] = 'C';
                break;
            case 11:
                multiAnswers[0] = 'D';
                break;
            case 12:
                multiAnswers[0] = 'C';
                multiAnswers[1] = 'D';
                break;
            case 13:
                multiAnswers[0] = 'B';
                multiAnswers[1] = 'D';
                break;
            default:
                break;
        }
        return multiAnswers;
    }

    public void setID(String ID) { this.ID = ID; }

    public String getID() { return ID; }

    public void submitMCAnswer(char MCAnswer) { this.MCAnswer = MCAnswer; } //only the last answer is submitted

    public char getMCAnswer() { return MCAnswer; }

    public void submitTFAnswer(boolean TFAnswer) { this.TFAnswer = TFAnswer; } //only the last answer is submitted

    public boolean getTFAnswer() { return TFAnswer; }

    public void submitMultiAnswers( char[] multipleAnswers) { this.multipleAnswers = multipleAnswers; }

    public char[] getMultiAnswers() { return multipleAnswers; }
}
