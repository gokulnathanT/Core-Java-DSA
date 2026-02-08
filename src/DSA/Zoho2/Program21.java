package DSA.Zoho2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program21 {
    public static void main(String[] args) {
        int[] arr={10,21,100,22,101,299,200};
        int []arr1={4, 6, 3, 7};
        Arrays.sort(arr);
        int len=arr.length;
        int count=0;
        for(int i=len-1;i>=2;i--){
            int large=arr[i];
            int left=0,right=i-1;

            while(left<right){
                long sum=(long )arr[left]+arr[right];
                if(sum>large){
                    count+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        System.out.println(count);

    }
}
