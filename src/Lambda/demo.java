package Lambda;

@FunctionalInterface
interface A{
    void method(int n, int m);
}
public class demo {

    public static void main(String[] args) {
        A obj=(n,m)-> System.out.println("Overridden method inside anonymous inner class ! "+ n +" "+m);

        obj.method(1238,12);
    }

}


