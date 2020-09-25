import java.util.Random;

public class SimulationDriver
{
    //creates question type and configure the answer
    //configure question for iVote service
    //randomly generate a number of students and answers
    //submit all answers to iVote service
    //call iVote service to output function to display result
    public static void main(String[] args) {
        Random classSize = new Random();
        int numOfStudents = classSize.nextInt(36) + 5;
        Student Class[] = new Student[numOfStudents]; //creates a class of a size of 5 to 40
        System.out.println("Number of students in this class: "+ numOfStudents);
        System.out.println("----------------------------");

        for(int i = 0; i < Class.length; i++) {//assigns all the students to an ID
            Class[i] = new Student();
            Class[i].setID("ID:"+Class[i].randomID());
        }

        //Question generation
        Question newQuestion = new Question();
        int questionDecider = newQuestion.generateQuestion();
        if(questionDecider == 1) {
            for(int j = 0; j < Class.length; j++) {//generates an answer for all students for multiple choice
                Class[j].submitMCAnswer(Class[j].generateMCAnswer()); //submits a randomly generated answer
            }
        }
        else if (questionDecider == 2){
            for(int k = 0; k < Class.length; k++) { //generates an answer for all students for true/false
                Class[k].submitTFAnswer(Class[k].generateTFAnswer()); //submits a randomly generated answer
            }
        }
        else if (questionDecider == 3) {
            for(int l = 0; l < Class.length; l++) { //generates multiple answers for all students for this question
                Class[l].submitMultiAnswers(Class[l].generateMultipleAnswers()); //submits randomly generated answers
            }
        }
        VotingService votes = new VotingService();
        votes.voteService(Class, newQuestion); //calls the voting service function within the coting service class
    }
}
