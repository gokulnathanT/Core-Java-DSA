package DSA.Zoho2;

public class Program17 {
    public static void main(String[] args) {
        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
        int index=0;
        for(int num:arr){
            if(num!=0){
                arr[index++]=num;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
