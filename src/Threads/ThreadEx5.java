package Threads;




class Counter {
    private int count=0;

    public synchronized void  increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
public class ThreadEx5 {
    public static void main(String[] args) {
        Counter co=new Counter();

        Thread th1=new Thread(()->{
            synchronized (co){
                for (int i=0;i<100000;i++){
                    co.increment();
                }
                System.out.println("Thread 1 finished !");
            }

        });

        Thread th2=new Thread(()->{
            synchronized (co){
                for (int i=0;i<100000;i++){
                    co.increment();
                }
                System.out.println("Thread 2 finished !");
            }

        });

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Final count : "+co.getCount());
    }
}
