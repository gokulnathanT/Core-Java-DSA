package DSA.Greedy;

import java.util.Map;
import java.util.TreeMap;

public class Greedy2 {
    public static void main(String[] args) {
        int[] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
        Map<Integer,Integer> platformRequirement=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            platformRequirement.put(arr[i],platformRequirement.getOrDefault(arr[i],0)+1);
            platformRequirement.put(dep[i]+1,platformRequirement.getOrDefault(dep[i],0)-1);
        }
        int count=0,max=0;
        for(Map.Entry<Integer,Integer> entry:platformRequirement.entrySet()){
                count+=entry.getValue();
                max=Math.max(count,max);
        }
        System.out.println(max);
    }
}
