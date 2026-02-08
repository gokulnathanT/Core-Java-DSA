package DSA.Zoho2;

import java.util.HashSet;
import java.util.Set;

public class Program20 {
    public static void main(String[] args) {
        int arr[]={8, 2, 4, 5, 3, 7, 1};
        Set<Integer> found=new HashSet<>();
        int n=arr.length;
//        for(int num:arr){
//            found.add(num);
//        }

//        for(int i=1;i<=arr.length;i++){
//            if(!found.contains(i)){
//                System.out.println(i);
//
//            }
//        }

        for(int i=0;i<n;i++){
            while(arr[i]<=n&&arr[arr[i]-1]!=arr[i]){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
                return;
            }
        }
        for(int num:arr){

            System.out.print(num+" ");
        }

    }
}
