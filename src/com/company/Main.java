package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer=new Programmer("Nurbolot","programist","peaksoft");
        System.out.println(programmer);
        programmer.eat();
        programmer.learn();
        programmer.walk();
        Dancer danser=new Dancer("aliy","biychi","dans");
        System.out.println(danser);
        danser.eat();
        danser.learn();
        danser.walk();
        Singer singer=new Singer("nur","urdayt","urchu");
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();



    }
}
