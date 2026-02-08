package Tasks.Task2;

public class Process {
    public static void main(String[] args) {
        InterviewProcess interviewProcess=new InterviewProcess("Gokul") {

            double score=92.3;
            void evaluate() {
                System.out.println(candidateName +" has scored " + score);
            }
        };
        interviewProcess.evaluate();
    }
}
