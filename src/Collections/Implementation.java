package Collections;

import java.util.*;

public class Implementation {
    public static void main(String[] args) {
//        Map<Integer,Integer> map=new HashMap<>();
//        Queue<Image> queue1=new ArrayDeque<>();
//        Queue<Integer> queue=new PriorityQueue<>(new customComparator());
//        queue1.add(new Image(10));
//        while(!queue1.isEmpty()){
//            System.out.println(queue1.poll());
//        }








//
//        List<Integer> list1=new ArrayList<>();
//        List<Integer> list2=new Vector<>();
//        List<Integer> list3=new LinkedList<>();
//        List<Integer> list4=new Stack<>();
//        Stack<Integer> stack=new Stack<>();
//        stack.push(10);
//        stack.pop();
//        list4.add(4);
//        list1.add(1);
//        list1.addFirst(2);
//        list2.add(1);
//        list2.addFirst(2);;
//        list3.add(1);
//        list3.addFirst(4);
//
//
//        Queue<Integer> queue2=new ArrayDeque<>();
//        queue2.add(1);
//        Deque<Integer> deque=new ArrayDeque<>();
//        deque.add(1);
//        deque.poll();
//        HashMap<Integer,Integer> map1=new HashMap<>();
//        HashSet<Integer> set=new HashSet<>();
//        set.add(10);


        Set<Integer> set1=new HashSet<>();
        set1.add(100);
        set1.add(101);
        Iterator<Integer> iterator=set1.iterator();


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }

    public static class customComparator implements Comparator<Integer>{
        public int compare(Integer num1,Integer num2){
            return num2-num1;
        }


    }

 static class Image{
        int size;

     public Image(int size) {
         this.size = size;
     }
 }


}
