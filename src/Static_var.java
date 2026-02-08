
public class Static_var {
   static class Test{
        static String name;
        public Test(String name){
            Test.name=name;
        }
    }
    public static void main(String[] args) {
        Test a=new Test("gokul");
        Test b=new Test("nathan");
        Test.name="gokulnathan";
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
