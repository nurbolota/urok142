package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("array");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("run");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("pepsi");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +super.toString()+
                '}';
    }
}

