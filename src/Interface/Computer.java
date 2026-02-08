package Interface;

interface Computer extends CPUCooler {
    void code();
}
interface CPUCooler{
    void cooling();
}
class Laptop implements Computer{
    public void code (){
        System.out.println("Performing coding in laptop");
    }
    public void cooling() {
        System.out.println("Cooling using CPU cooler  in laptop!");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Performing coding in desktop");
    }
    public void cooling() {
        System.out.println("Cooling using CPU cooler in desktop!");
    }
}
class demo{
    public static void main(String[] args) {
        Computer com=new Laptop();
        com.code();
        com.cooling();

    }
}