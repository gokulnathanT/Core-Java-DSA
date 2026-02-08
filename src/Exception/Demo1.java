package Exception;

class gokulException extends Exception{
    public  gokulException( String s){
            super(s);
    }
}


class loadingEg{
    static {
        int a=10;
        int b=20;
        System.out.println("Valuation of this class is "+(a+b));
        System.out.println(" Loading check with static block !");
    }
    public loadingEg(){
        System.out.println("Loading example using class loader ! ");
    }
}
class A{
    public void checking() throws Exception{
//        System.out.println("Printing for checking !");

        ClassLoader classLoader= A.class.getClassLoader();
        classLoader.loadClass("Exception.loadingEg");
        loadingEg lg=new loadingEg();
        loadingEg lg1=new loadingEg();
        loadingEg lg2=new loadingEg();
       B obj2=new B();
       obj2.layeredCheck();


    }


}


class B extends A{
    public void layeredCheck()throws Exception{
        int d=0;
        int num=20-1;
        System.out.println(num);
        if(d==0){
            throw new gokulException("with sub exception !");
        }
        int ans=num/d;
    }
}


public class Demo1 {

    public static void main(String[] args) {
        B obj=new B();
        try{
//            obj.layeredCheck();
            A obj1=new A();
            obj1.checking();
        }
        catch (Exception e){
            System.out.println("Catch the exception ! Handled in main " +e);

            e.getMessage();
        }
        finally {
            System.out.println("FINALLYYYY");
        }
    }
}
