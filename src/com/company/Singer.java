package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("urdait");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("klub");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("fish");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +super.toString()+
                '}';
    }
}
