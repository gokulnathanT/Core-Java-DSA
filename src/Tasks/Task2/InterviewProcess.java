package Tasks.Task2;

public abstract class InterviewProcess {

    String candidateName;
    InterviewProcess(String name) {
        this.candidateName = name;
    }
    abstract void evaluate();
}
