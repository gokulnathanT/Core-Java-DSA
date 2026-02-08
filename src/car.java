public class car {
    String color;
    String company;
    int price;
    int seater;

    public car(){
       this.color="black";
       this.company="Ford";
       this.price=1000000;
       this.seater=5;
    }
    public car(String color,String company,int price){
        this.color=color;
        this.company=company;
        this.price=price;
        this.seater=5;
    }
    public car(String color,String company,int price,int seater){
        this.color=color;
        this.company=company;
        this.price=price;
        this.seater=seater;
    }
}
