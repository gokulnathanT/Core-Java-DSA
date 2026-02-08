package Interfaces;

public class Program1 {
    public static void main(String[] args) {



        Base run=new Base("Gokul"){

            public void print(){
                System.out.println( str+"xyz");
            }
        };
        run.print();
    }
    static abstract class Base{
        String str="hello";
        public Base(String word){
            str=word;
        }

         abstract  void print();
    }
}
