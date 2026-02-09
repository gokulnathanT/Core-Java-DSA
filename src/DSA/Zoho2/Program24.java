package DSA.Zoho2;

public class Program24 {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        int []arr1={2,2,3,3,6,4,4,5,5};
        int[] arr2={3,3,7,7,10,11,11};
        int len=arr.length;
        int left=0,right=len-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid]==arr[mid+1]) {

                left = mid+2;

            }
            else{
                right=mid;
            }
        }
//        if(arr[left]==)
        System.out.println(arr[left]);
    }
}
