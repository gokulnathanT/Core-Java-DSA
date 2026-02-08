package Threads;


class ThreadEx extends Thread{
    public void run(){
        try{
            System.out.println("Thread is in Runnable state now (just started)");
            Thread.sleep(5000);
            synchronized (ThreadEx.class){
                System.out.println("Thread acquired a lock , do some work...");
                Thread.sleep(3000);
            }
            System.out.println("Thread finished processing...");
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
public class ThreadEx2 {
    public static void main(String[] args) {
       ThreadEx example=new ThreadEx();
        System.out.println("Thread state (new) :"+example.getState());
        example.start();
        System.out.println("Thread state(Runnable) : "+example.getState());
        try{
            Thread.sleep(1000);
            System.out.println("Thread state (likely TIMED_WAITING) : "+example.getState());

            example.join();

            System.out.println("Thread state (Terminated) after join : "+example.getState());
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
