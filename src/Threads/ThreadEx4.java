package Threads;

class thread extends Thread{
    public void run() {
        try {
            System.out.println("Started the example thread ! ");
            System.out.println("Thread going to sleep : ");
            Thread.sleep(100);
            System.out.println("Exited the sleep state ");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}


public class ThreadEx4 {

    public static void main(String[] args) {


        thread th=new thread();
        System.out.println("New thread created and going to start : "+th.getState());
        th.start();
        try{
            System.out.println("Created thread is being running : "+th.getState());
            System.out.println(" Moving thread to sleep for 500ms");
            Thread.sleep(500);
            System.out.println("Thread interupted ? "+Thread.interrupted());

            System.out.println("main thread going to terminate : "+ Thread.currentThread().getState());
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }




    }
}

