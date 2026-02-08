package Abstract;

abstract public class Car {

    public abstract void drive();
    public abstract void topOpen();
    public void parts(){
        System.out.println("Assemblying the parts of car !");
    }
}

 abstract class Benz extends Car{
    public void drive(){
        System.out.println("Driving functionality added ");
    }
}

class Mercedes extends Benz{
    public void topOpen(){
        System.out.println("Top open feature added !");
    }

    public static void main(String[] args) {
        Benz obj=new Mercedes();
        obj.topOpen();
        obj.drive();
        obj.parts();
    }
}
