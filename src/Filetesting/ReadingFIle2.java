package Filetesting;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class ReadingFIle2 {
    public static void main(String[] args) {
        long stTime1=System.currentTimeMillis();
        try(BufferedInputStream bis=new BufferedInputStream((new FileInputStream("verylargeText.txt")))){
            byte[]buffer=new byte[32768];
            while(bis.read(buffer)!=-1){
                String chunk=new String(buffer);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        long endTime1=System.currentTimeMillis();
        System.out.println("  Time with bufferInputStream : "+(endTime1-stTime1));

        long stTime2=System.currentTimeMillis();
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("verylargeText.txt"))){
            byte[]buffer=new byte[32768];
            while(bis.read(buffer)!=-1){
                String chunk=new String(buffer);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        long endTime2=System.currentTimeMillis();
        System.out.println("  Time without bufferInputStream : "+(endTime2-stTime2));
    }
}
