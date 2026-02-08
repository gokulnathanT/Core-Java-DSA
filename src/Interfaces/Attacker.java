package Interfaces;

import java.util.*;

public class Attacker extends Player {

    public Attacker(int power) {
        super(power);
    }

    @Override
    public void run() {
        System.out.println("Runningggg");
    }
    static class Main{
        public static void main(String[] args) {
//            Player player1=new Player() {
//                @Override
//                public void run() {
//                    System.out.println("Running ");
//                }
//            };
//            player1.jump();
//
//            Skill skill1=new Skill() {
//
//                public void move() {
//                    System.out.println("Move");
//                }
//                public void jump() {
//                    System.out.println("Jump");
//                }
//                public void run() {
//                    System.out.println("Run");
//                }
//            };
//
//            skill1.jump();


//            int []arr = {1, 2, 7, 4, 5, 6, 3, 8, 9, 0};
//
//            Integer arr1[]= Arrays.stream(arr).boxed().toArray(Integer[]::new);
//            Arrays.sort(arr1, Comparator.reverseOrder());
//            int newarr[]=Arrays.stream(arr1).mapToInt(Integer::intValue).toArray();
//            System.out.println(newarr.toString());
//
//            for (int num:newarr){
//                System.out.println(num);
//            }

             Attacker a1=new Attacker(99);
            Attacker a2=new Attacker(97);
            Attacker a3=new Attacker(92);
            Attacker a4=new Attacker(98);
            Attacker a5=new Attacker(91);
            Attacker a6=new Attacker(92);
            Attacker a7=new Attacker(95);
            Attacker a8=new Attacker(98);

            List<Attacker> list= new ArrayList<>();

            list.add(a1);
            list.add(a2);
            list.add(a3);
            list.add(a4);
            list.add(a5);
            list.add(a6);
            list.add(a7);
            list.add(a8);

//            Arrays.sort(list,Comparator.reverseOrder());
            for(Attacker a:list){
                System.out.print(a.power+" ");
            }
            System.out.println();
            PlayerComparator playerComparator=new PlayerComparator();
            Collections.sort(list,playerComparator);
            for(Attacker a:list){
                System.out.print(a.power+" ");
            }
            System.out.println();
        }
    }

    public  static class PlayerComparator implements Comparator<Attacker>{
        public int compare(Attacker attacker1,Attacker attacker2){
            return Integer.compare(attacker1.power,attacker2.power);
        }
    }
}


