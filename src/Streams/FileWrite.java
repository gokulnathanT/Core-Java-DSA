package Streams;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("D:\\Java Complete Guide\\OOPS\\OOP 1\\src\\Streams\\text.txt",true)){
            fw.write("Appended content atfer that !");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Java Complete Guide\\OOPS\\OOP 1\\src\\Streams\\text.txt"))){
            bw.write("modified using buffWriter content atfer that !");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br=new BufferedReader(new FileReader("D:\\Java Complete Guide\\OOPS\\OOP 1\\src\\Streams\\text.txt"))){

            String line;
            while((line=br.readLine())!=null){
                if(!line.isEmpty()){
                    System.out.println(line);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
