package DSA.Zoho2;

public class Program9 {
    public static void main(String[] args) {
        String v1="7.01.23";
        String v2="7.01.029";
        String []version1=v1.split("\\.");
        String []version2=v2.split("\\.");
        int i1=0,i2=0;
        int l1=version1.length;
        int l2=version2.length;
        while(i1<l1&&i2<l2){
            int currV1=Integer.parseInt(version1[i1]);
            int currV2=Integer.parseInt(version2[i2]);
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
}
