package Threads;

class Check implements Runnable{
    public  void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Running thread ! ");
        }
    }
}

class Check2 extends Thread{
    public  void run(){
        try {
            Thread.sleep(1000);
            System.out.println("Current thread : "+Thread.currentThread().getName());
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadEx3{
    public static void main(String[] args) {
//
        Thread thread1=new Thread(()->{
            try {
                Thread.sleep(10000);
                System.out.println(" Thread current : "+Thread.currentThread().getName());
                System.out.println("Thread finished wprk  !");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(" Thread current : "+Thread.currentThread().getName());

        System.out.println("State after creation : "+thread1.getState());
        thread1.start();
        System.out.println("State after start : "+thread1.getState());

        try{
            Thread.sleep(100);
            System.out.println("State during sleep :"+thread1.getState());
             thread1.join(); // makes the example thread to connect with the main
            // (main followup the example thread)
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State after termination : "+thread1.getState());
    }
}