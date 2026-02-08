package Filetesting;

import java.io.*;
import java.util.Scanner;

public class ReadingFile {

    public static void main(String[] args)  {
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter : ");
//        String name=reader.readLine();
//        System.out.println("Name : "+name);

//        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")))){
//            String lines;
//            while((lines= br.readLine())!=null){
//                System.out.println(lines);
//
//            }
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        try(BufferedReader br=new BufferedReader(new FileReader("text.txt"))){
//            String lines;
//            while((lines= br.readLine())!=null){
//                System.out.println(lines);
//
//            }
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        long stTime1=System.currentTimeMillis();
        try(Scanner sc=new Scanner((new FileInputStream("largeText.txt")))){

            while(sc.hasNextLine()){
//                String lines=
                        sc.nextLine();
//                System.out.println(lines);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        long endTime1=System.currentTimeMillis();
        System.out.println("  Time without bufferInputStream : "+(endTime1-stTime1));

        long stTime2=System.currentTimeMillis();
        try(Scanner sc=new Scanner(new BufferedInputStream(new FileInputStream("largeText.txt")))){

            while(sc.hasNextLine()){
//                String lines=
                sc.nextLine();
//                System.out.println(lines);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        long endTime2=System.currentTimeMillis();
        System.out.println("  Time with bufferInputStream : "+(endTime2-stTime2));

    }
}
