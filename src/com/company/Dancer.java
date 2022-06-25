package com.company;

public class Dancer extends Person {
  private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }



    public void learn(){
        super.learn();
       System.out.println("biydi");
   }
   public void walk(){
        super.walk();
       System.out.println("biylegenge");
   }
   public void eat(){
        super.eat();
       System.out.println("kasha");
   }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}

