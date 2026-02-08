package Interfaces;

import java.io.*;

public class serial {
     static class A implements Serializable{
        static int data;

        transient  int data2;
        public A(int data,int data2) {
            A.data = data;
            this.data2=data2;
        }

         @Override
         public String toString() {
             return "A{" +
                     "\ndata2=" + data2 +
                     "\ndata=" + data +
                     '}';
         }
     }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A obj=new A(10,22);
        FileOutputStream fileOutputStream=new FileOutputStream("Data.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(obj);

        System.out.println("Data before deserialization !");
        System.out.println(obj.toString());
        fileOutputStream.close();
        objectOutputStream.close();
        obj.data=20;


        obj=null;
        FileInputStream file = new FileInputStream
                ("Data.txt");
        ObjectInputStream in = new ObjectInputStream
                (file);

        A objNew=(A)in.readObject();
        System.out.println("After Deserialization !");
        System.out.println(objNew.toString());

        file.close();
        in.close();

    }

}
