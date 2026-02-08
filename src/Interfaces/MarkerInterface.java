package Interfaces;

import java.util.Arrays;

public class MarkerInterface {
    static class A implements Cloneable{
        int i;
        public A(int i){
            this.i=i;
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }


    }
    static class Test{
        public static void main(String[] args) throws CloneNotSupportedException {
            A a=new A(10);
            A b=(A)a.clone();
            b.i=20;
            System.out.println(b.i);
            System.out.println(a.i);

            int []arr={1,2,3};
            Arrays.sort(arr);
            String s1="helloo";
            String s2="helloo";
            if(s1.equals(s2)){
                System.out.println("True");
            }
            else{
                System.out.println("false");
            }

            System.out.println("Concatenation (x+y) = " + (10+ 20));
        }
    }
}
