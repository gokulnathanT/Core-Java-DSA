public class Box1 {

    double l;
    double h;
    double w;
    Box1(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    Box1(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

    public Box1(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box1(Box1 old){
        // access based on the reference var type not the object type
        // same as upcasting in line - passing the boxweight object but it is refered to a box reference type
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
}
