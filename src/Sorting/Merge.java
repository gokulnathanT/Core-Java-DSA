package Sorting;

public class Merge {
    public static void main(String[] args) {
        int arr[]={1,6,3,8,2,4,8,10,9,11};
        sort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    private static void sort(int[]arr,int left,int right){

        if(left<right){
            int mid=left+(right-left)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    private static void merge(int []arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int leftarr[]=new int[n1];
        int rightarr[]=new int[n2];
        for(int i=0;i<n1;i++){
            leftarr[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightarr[j]=arr[mid+1+j];
        }

        int i=0,j=0;
        int x=left;
        while(i<n1&&j<n2){
            if(leftarr[i]<=rightarr[j]){
                arr[x++]=leftarr[i];
                i++;
            }
             else{
                arr[x++]=rightarr[j];
                j++;
            }
        }
        while(i<n1){
            arr[x++]=leftarr[i++];
        }
        while(j<n2){
            arr[x++]=rightarr[j++];
        }

    }

}
