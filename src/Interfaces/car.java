package Interfaces;

public class car implements engine,media{
    @Override
    public void begin() {
        System.out.println("beginning engine !");
    }

    @Override
    public void end() {
        System.out.println("Ending engine !");
    }

    @Override
    public void service() {
        System.out.println("Service call");
    }

    @Override
    public void play() {
        System.out.println("Playing song !");
    }

    @Override
    public void pause() {
        System.out.println(" Replaying song !");
    }
}
