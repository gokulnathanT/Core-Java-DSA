package DSA.Zoho2;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class Program9 {
    public static void main(String[] args) {
        String v1="7..23";
        String v2="7.1.23";
        List<String> version1=splitString(v1);
        List<String> version2=splitString(v2);
        int i1=0,i2=0;
        int l1=version1.size();
        int l2=version2.size();
        while(i1<l1&&i2<l2){
            int currV1=Integer.parseInt(version1.get(i1));
            int currV2=Integer.parseInt(version2.get(i2));
            if(currV1<currV2){
                System.out.println("upgrade");
                return;
            } else if (currV1>currV2) {
                System.out.println("downgrade");
                return;
            }
            else{
                i1++;
                i2++;
            }
        }
        if(i1==l1&&i2==l2){
            System.out.println("equal");
        }
        else if(i1<l1){
            System.out.println("downgrade");
        }
        else{
            System.out.println("upgrade");
        }

    }

    public static List<String> splitString(String v1){
        StringBuilder sb=new StringBuilder();
        List<String> version=new ArrayList<>();
        for(int i=0;i<v1.length();i++){
            char ch=v1.charAt(i);
            if(ch=='.'){
                if(sb.isEmpty()){
                    version.add("0");
                }
                else{
                    version.add(sb.toString());
                    sb.setLength(0);
                }
            }
            else{
                sb.append(ch);
            }
        }
        if(sb.isEmpty()){
            version.add("0");
        }
        else{
            version.add(sb.toString());
        }
        return version;
    }
}
