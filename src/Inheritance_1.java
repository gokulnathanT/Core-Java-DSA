public class Inheritance_1 {
    public static void main(String[] args) {
        Inheritance.Box box=new Inheritance.Box();

        Inheritance.Box box1=new Inheritance.Box(box);
        System.out.println(box.h+" "+box.l+" "+ box.w);
        System.out.println(box1.h+" "+box1.l+" "+ box1.w);

    }

}
