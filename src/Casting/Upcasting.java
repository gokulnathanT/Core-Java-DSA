package Casting;
class parent{
    public void operation(){
        System.out.println("Parent class method !");
    }
}

class child extends parent{
    public void operation(){
        System.out.println("Child class method !");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        parent obj=(parent)new child();//upcasting
        obj.operation();
        child obj1=(child)obj;//downcasting
        obj1.operation();
    }
}
