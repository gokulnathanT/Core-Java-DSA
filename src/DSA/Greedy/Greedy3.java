package DSA.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy3 {
    static class Job{
        int id;
        int dead;
        int profit;
        public Job(){
        }
    }
    public static void main(String[] args) {
        Job[] arr = new Job[] {
                new Job() {{id = 1; dead = 4; profit = 20;}},
                new Job() {{id = 2; dead = 1; profit = 10;}},
                new Job() {{id = 3; dead = 2; profit = 40;}},
                new Job() {{id = 4; dead = 2; profit = 30;}}
        };

        int max=Arrays.stream(arr).max(Comparator.comparingInt(a->a.dead)).get().dead;
        Arrays.sort(arr, (a,b)-> b.profit-a.profit);
        int time[]=new int[max+1];
        int profit=0;
        for(Job job:arr){
            int end=job.dead;
            int i=end;
            while(i>=1){
                if(time[i]!=-1){
                    time[i]=-1;
                    profit+=job.profit;
                    break;
                }
                else{
                    i--;
                }
            }
        }
        System.out.println(profit);

    }
}
