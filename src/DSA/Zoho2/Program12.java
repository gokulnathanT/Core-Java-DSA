package DSA.Zoho2;

public class Program12 {
    public static void main(String[] args) {
        int arr[]={3,2,1,0,4};
        int n=arr.length;
        int maxJump=0;
        for(int i=0;i<n;i++){
            maxJump=Math.max(maxJump,i+arr[i]);
            if(maxJump==n-1){
                System.out.println("Reached");
                return;
            }
        }
        System.out.println("Unreachable");
    }
}
