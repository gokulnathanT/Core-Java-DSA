package Interfaces;

public abstract class Player implements Skill{

    int power;

    public Player(int power) {
        this.power = power;
    }

    @Override
    public void jump() {
        System.out.println("Jumpinggggg");
    }

    @Override
    public void move() {
        System.out.println("Movingggg");
    }
}
