package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList <T>{

         private Object[] data;
         private static final int DEFAULT_SIZE=5;
         private int size=0;

        public  CustomArrayList() {
            this.data=new Object[DEFAULT_SIZE];
        }
        public void add(T d){
            if(isFull()){
                resize();
            }
            data[size++]=d;
        }
        public T remove(){
            return (T) data[--size];
        }

        public T get(int ind){
                return (T) data[ind];

        }
        public void set(int ind,T value){
            data[ind]=value;
        }
        public int length(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public boolean isFull(){


            return data.length==size;
        }

        public void resize(){
            Object []temp=new Object[DEFAULT_SIZE*2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data=temp;
        }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList<String> d= new CustomArrayList();
        d.add("a");
        d.add("b");
        d.add("x");
        d.add("y");
        d.add("z");
        d.set(1,"c");
        System.out.println(d);
        System.out.println(d.remove());
        if(d.isEmpty()){
            System.out.println("The list is Empty !!!");
        }
        else{
            System.out.println("The list has the following elements !!!");
        }
        for(int i=0;i<d.length();i++) {
            System.out.println(d.get(i));
        }

    }
    }



