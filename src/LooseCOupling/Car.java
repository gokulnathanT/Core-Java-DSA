package LooseCOupling;

public class Car {
    Engine engine;
    public Car(){
        this.engine=new Engine();
    }

    public Car (Engine Engine){
        this.engine=Engine;
    }
}
