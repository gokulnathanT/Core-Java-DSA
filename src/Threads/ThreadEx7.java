package Threads;


class Example{
    int num;                        //class variable
    boolean valueSet=false;         //used for wait state
    public synchronized void put(int num){
        while(valueSet){
            try{
                wait();
            }
            catch (Exception e){}
        }
        System.out.println("Put :"+num);
        this.num=num;
        valueSet=true;
        notify();
    }
    public synchronized void get(){
        while(!valueSet){
            try{
               wait();
            }
            catch (Exception e){}
        }
        System.out.println("Get: "+num);
        valueSet=false;
        notify();
    }
}


class Producer implements Runnable{

    Example e;                  //only the reference used

    public Producer(Example e){    //same object is used for both the threads
        this.e=e;
        Thread t=new Thread(this,"Producer");
        t.start();
    }

    public void run() {
        int i=0;
        while(true){                     // Looping infinitely
            e.put(i++);                  //updating the value frequently
            try{Thread.sleep(100);}catch (Exception e){};
            // thread is not synchronized as it do some fetches inconsistently

        }
    }
}



class Consumer implements Runnable{


    Example e;
    //Reference of the example class


    public Consumer (Example e){
        this.e=e;
        //instantiating object of example for this class (more like referring )


        Thread t=new Thread(this,"Consumer ");
        // creating a thread and passing this object itself
        // which is implemented by the runnable interface

        t.start();
        // constructor itself creating and starting the thread
    }


    public void run() {
        while(true){
            e.get();           // this prints the value of num every time infinitely
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){};
        }
    }
}




public class ThreadEx7 {
    public static void main(String[] args) {
        Example obj=new Example();
        new Producer(obj);
        new Consumer(obj);
    }
}



// if we dont use any wait and notify methods then there will be a inconsistency of the threads fetch and put
// synchronization is a way to solve this issue and maintaining the running flow with a variables

