package DSA.Greedy;

import java.util.Arrays;

public class Greedy4 {
    static class Item{
        int value;
        int weight;
        public Item(int value,int weight){
            this.value=value;
            this.weight=weight;
        }
    }
    public static void main(String[] args) {
        int n = 3, weight = 50;  // Number of items and capacity of knapsack
        Item[] arr = {
                new Item(100, 20),
                new Item(60, 10),
                new Item(120, 30)
        };

        Arrays.sort(arr, (a,b)->(b.value/b.weight) -(a.value / a.weight));
        int capacity=weight;
        double maxCapacity=0;
        for(Item item:arr){
            if(capacity>=item.weight){
                maxCapacity+= item.value;
                capacity-=item.weight;
            }
            else if(capacity>0){
                int perUnit=item.value/ item.weight;
                maxCapacity+=perUnit*capacity;
                break;
            }
            else{
                break;
            }
        }
        System.out.println(maxCapacity);
    }
}
