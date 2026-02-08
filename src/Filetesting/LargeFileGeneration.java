package Filetesting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LargeFileGeneration {
    public static void main(String[] args){

        File file=new File("verylargeText.txt");
        int lines=10000000;
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
            for(int i=0;i<=lines;i++){
                bw.write("hello buddy hello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddyhello buddy!!!  "+i);
                bw.newLine();;
            }
            System.out.println("Large text file created : "+file.getAbsolutePath());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
