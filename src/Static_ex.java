public class Static_ex {
    static int a=1;
    static int b;

    //loaded once  when the class loaded when the first object is created
    static{
        System.out.println("In static block !");
        b=a*4;
    }
    public static  void main(String[] args){
        Static_ex obj=new Static_ex();
        System.out.println(Static_ex.a+" "+Static_ex.b);

        Static_ex.b+=10;

        Static_ex obj1=new Static_ex();
        System.out.println(Static_ex.a+" "+Static_ex.b);
    }
}
