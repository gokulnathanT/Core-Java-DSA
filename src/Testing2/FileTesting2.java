package Testing2;

import java.io.*;

public class FileTesting2 {
    public static void main(String[] args) throws FileNotFoundException {


        try(FileOutputStream fos=new FileOutputStream("text.txt")) {
            String str="This is the parse which i'm writing using the file output stream ! ";
            System.out.print("Enter message :");
            BufferedReader isr=new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb=new StringBuilder();
            String str1=isr.readLine();
            byte[]msg=str1.getBytes();
            fos.write(msg);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
