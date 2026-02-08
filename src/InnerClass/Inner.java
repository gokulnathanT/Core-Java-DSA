package InnerClass;

public class Inner {
    public static void main(String[] args) {
//        A obj=new A();
//        obj.call();
//        A.B obj1=new A.B();
//        obj1.callable();
//        ~
//        X obj=new X(){
//            public void print(){
//                System.out.println("Modified print method anonymously");
//            }
//        };
//        obj.print();
//
//        X obj1=new X();
//        obj1.print();
//        obj.unchanged();
//        obj1.unchanged();


        P obj=new P() {
            public void abstWithAnonymous(){
                System.out.println("Making a anonymous class for P with overriding the abstract method !");
            }
            public void abs2(){

            }
        };
        obj.abstWithAnonymous();
    }
}
 class A{
    public void call(){
        System.out.println("Method in class A ");
    }
     static class B{
        public void callable(){
            System.out.println("Method in class B");
        }
    }
}
class X{
    public void print(){
        System.out.println("OG print method inside X class !");
    }

    public void unchanged(){
        System.out.println("Common method for checking !");
    }
}


abstract class P{
    public abstract void abstWithAnonymous();
    public abstract void abs2();

}

class Q extends P{
    public void abs2(){

    }

    public void abstWithAnonymous() {

    }
}
//class Q extends P{
//    public void abstWithAnonymous(){
//        System.out.println("Checking abstract with anonymous ! ");
//    }
//}