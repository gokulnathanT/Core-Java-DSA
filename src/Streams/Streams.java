package Streams;

import java.io.InputStreamReader;
public class Streams {

    public static void main(String[] args) {
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.println("Type : ");

            while(isr.ready()){
                System.out.println("This will never run immediately");
            }
            System.out.print("Reading input :");
            int letters;
            while((letters=isr.read())!=-1){
                if(letters=='\n')break;
                System.out.print((char)letters);
            }
            System.out.println();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
