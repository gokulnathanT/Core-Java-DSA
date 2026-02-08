import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {
    public static void main(String[] args) throws IOException {


        try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){  // try with resources
            System.out.println("Enter the input : ");
            int num=Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally {  // especially used for closing the resources after the try block executed
                   // helpful while having an exception in try and necessary to close resources , connections !
            System.out.println("finally");
        }
    }
}
