package Threads;

class ThreadCreation extends Thread{
    public void run(){

        try{
            for(int i=0;i<100;i++){
                System.out.println(" running the method run");
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}

class ThreadCreation2 extends Thread{
    public void run(){
        try{
            for(int i=0;i<100;i++){
                System.out.println("runnning thread 2 run method ");
                thread.sleep(100);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadEx6 {
    public static void main(String[] args) {
        ThreadCreation th=new ThreadCreation();
        ThreadCreation2 th2=new ThreadCreation2();
        try{
            th.start();
            th2.start();
            th.join(1000);
            th2.join(10000);
        }catch(Exception e){
            e.getMessage();
        }
        System.out.println(" The main terminates !");
    }
}
