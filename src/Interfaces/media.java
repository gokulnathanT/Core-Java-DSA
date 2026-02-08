package Interfaces;

public interface media {
    void play();
    void pause();
    static int replay(){
        System.out.println("replaying using interfaces !!!");
        return 1238;
    }
}
