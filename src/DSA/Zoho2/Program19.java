package DSA.Zoho2;

public class Program19 {
    public static void main(String[] args) {
        int arr[]={-2,3,-2,4,2,9,2,4,-9};
        int maxPro=arr[0];
        int currMax=arr[0],currMin=arr[0];
        for(int i=1;i<9;i++){
            int max=currMax;
            currMax=Math.max(arr[i],Math.max(arr[i]*currMin,arr[i]*currMax));
            currMin=Math.min(arr[i],Math.min(arr[i]*currMin,arr[i]*max));
            maxPro=Math.max(maxPro,currMax);
        }
        System.out.println(maxPro);


    }
}
