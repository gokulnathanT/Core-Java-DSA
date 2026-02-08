import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class QueueImplementation {


    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return 0;
            }

            @Override
            public int size() {
                return 0;
            }
        };
        List<Integer> list4=new Vector<>();
        List<Integer> list5=new CopyOnWriteArrayList<>();
        List<Integer> list6=new AbstractSequentialList<Integer>() {
            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
    }
}
