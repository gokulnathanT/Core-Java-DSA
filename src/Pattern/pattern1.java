package Pattern;

public class pattern1 {
    public static void main(String[] args) {
        int n=10;
        int mid=n/2;
        int last=0;
        for(int i=0;i<=mid;i++){
            int init=(i+1)*(i+2)/2;
            for(int j=0;j<=i;j++){
                System.out.print(init-j+" ");
            }
            System.out.println();
            if(i==mid){
                last=init;
            }
        }
        for(int i=mid;i>0;i--){
            int init=last+i;
            for(int j=0;j<i;j++){
                System.out.print(init-j+" ");
            }
            System.out.println();
            last=init;
        }

    }
}
