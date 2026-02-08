public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

//        BoxWeight box3=new BoxWeight();
//        Box1 box4=new BoxWeight(12,23,34,45);
//        System.out.println(box3.h+" "+box3.l+" "+box3.weight);
//        System.out.println(box4.h+" "+box4.l+" "+box4.w+ ((BoxWeight) box4).weight);
        car car1=new car();
        System.out.println(car1.color+" "+car1.company+" "+car1.price+" "+car1.seater);
        car car2=new car("blue","benz",12000000,4);
        System.out.println(car2.color+" "+car2.company+" "+car2.price+" "+car2.seater);

        car car3=new xuvcar("white","audi",30000000,8);
        System.out.println(car3.color+" "+car3.company+" "+car3.price+" "+car3.seater);

        car car4=new xuvcar();
        System.out.println(car4.color+" "+car4.company+" "+car4.price+" "+car4.seater);

    }




}