package Core;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class program1 {
    public static void main(String[] args) {
//   System.getProperties().forEach((a,b)-> System.out.println(a+" : "+b));

//        int a=25;
//        int b=~a;
//        System.out.println(a+" :: "+b);
        Integer a=1;
        Integer b=1;
        Integer c=1;
        System.out.println(a==b);
        AtomicInteger atomicInteger=new AtomicInteger(0);
        atomicInteger.getAndIncrement();
        AtomicInteger atomicInteger2=new AtomicInteger(0);
        atomicInteger2.incrementAndGet();
        System.out.println(atomicInteger);
        System.out.println(atomicInteger2);


        try{
            int x=5,y=0;
            if(y==0){
                throw new GokulException("custom divide by zero exception");
            }
            System.out.println(4/0);
        }
        catch (GokulException e){
            System.out.println(e);
        }
        StringBuilder sb=new StringBuilder();
        StringBuffer sf=new StringBuffer();

        Integer arr[]={1,2,4,5,6};
        Arrays.sort(arr,( e, f)->Integer.compare((int )e,(int)f));

    }




}
