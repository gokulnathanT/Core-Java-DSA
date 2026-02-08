package Threads;

class task1 extends Thread{
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Line " + i);
        }

    }
}
class task2 extends  Thread{
    public synchronized void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Additional Line " + i);
        }
    }
}
public class ThreadEx1 {

    public static void main(String[] args) {
        task1 obj1=new task1();
        task2 obj2=new task2();

        obj1.start();
        obj2.start();
    }
}
