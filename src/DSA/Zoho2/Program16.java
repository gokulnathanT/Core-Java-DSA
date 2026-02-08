package DSA.Zoho2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program16 {
    public static void main(String[] args) {
        int arr[]={5,4,5 ,6 ,9};
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // worst case space n
        int nums[][]=new int[map.size()][2];
        // worst case space 2n
        int i=0;
        for(int key:map.keySet()){
            nums[i][0]=key;
            nums[i][1]=map.get(key);
            i++;
        }
        Arrays.sort(nums,(a,b)->{
            if(a[1]==b[1]){
                return a[0]-b[0];
            }
            return b[1]-a[1];
        });
        //n log n time
        int index=0;
        for(int []num:nums){
            int value=num[0];

            int n=num[1];

            for(int x=0;x<n;x++){
                arr[index++]=value;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }


    }
}
