package Streams;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {
    public static void main(String[] args) {

        try(BufferedReader br=new BufferedReader(new FileReader("D:\\Java Complete Guide\\OOPS\\OOP 1\\src\\Streams\\text.txt"))){
           String letters;
            while((letters=br.readLine())!=null){
                if(!letters.isEmpty()){
                    System.out.println(letters);
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage()+":::");
        }
    }
}

