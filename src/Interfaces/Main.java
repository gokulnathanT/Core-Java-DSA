package Interfaces;

public class Main {
    public static void main(String[] args) {
        car car1=new car();
        int a=car1.x;
        System.out.println(a);
        car1.begin();
        car1.end();
        car1.play();
    }
}
