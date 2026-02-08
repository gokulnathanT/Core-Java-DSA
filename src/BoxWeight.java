public class BoxWeight extends Box1{

    double weight;
    public BoxWeight(){
        this.weight=-2;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);  // calling parent class constructor
        //for initializing values present in parent class
        this.weight = weight;
        this.w=weight;
    }
}
