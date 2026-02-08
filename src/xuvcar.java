public class xuvcar extends car{

    public xuvcar(){
        super();
        this.seater=7;
    }
    public xuvcar(String color,String company,int price,int seater){
        super(color,company,price);
        this.seater=seater;
    }
    public xuvcar(String color,String company,int price){
        super(color,company,price);
        this.seater=7;

    }
}
