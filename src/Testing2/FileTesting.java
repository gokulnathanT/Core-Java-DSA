package Testing2;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

public class FileTesting {
    @Override
    public String toString() {
        return "FileTesting{}";
    }

    public static void main(String[] args) {
        try {
//            FileDescriptor fd1=new FileDescriptor("text.txt");
            File f=new File("text.txt");
            FileInputStream fis=new FileInputStream(f);
            int c;
            int len=fis.available();
            FileChannel fc=fis.getChannel();
            FileDescriptor fd=fis.getFD();
            FileInputStream fis2=new FileInputStream(fd);
            int len2=fis2.available();
//            System.out.println(fc.size() +" "+ fd.valid());
            System.out.println(len2);
            byte[] arr=new byte[len2];
            fis2.read(arr,0,len2);

            System.out.println(new String(arr));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
