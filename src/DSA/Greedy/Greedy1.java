package DSA.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy1 {
    public static void main(String[] args) {
        int n=6;
        int str[]={1,3,0,5,8,5};
        int end[]={2,4,5,7,9,9};
        int intervals[][]=new int[n][3];
        for(int i=0;i<n;i++){
            intervals[i][0]=str[i];
            intervals[i][1]=end[i];
            intervals[i][2]=i;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int prev=-1;
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            if(prev==-1||prev<=start){
                System.out.println(intervals[i][2]+1);
                prev=intervals[i][1];
            }

        }

    }
}
