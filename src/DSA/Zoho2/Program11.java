package DSA.Zoho2;

public class Program11 {
    public static void main(String[] args) {
        int arr[]={5,0,0,5,0};
        int sum=0;
        for(int num:arr){
            sum+=num;
        }

        int currSum=0,n=arr.length;
        sum-=arr[0];
        if(n==1) {
            System.out.println(0);
            return;
        }
        for(int i=1;i<n;i++){
            currSum+=arr[i-1];
            sum-=arr[i];
            if(sum==currSum){
                System.out.println(i);
                return;
            }
        }
        System.out.println("No equilibrium");
    }
}
