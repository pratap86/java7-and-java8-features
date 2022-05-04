package com.pratap.java.inheritance;
class Parent{

    public String name = "parent-name";

    public void m1(){
        System.out.println("Parent()");
    }
}

class Child extends Parent{

    public String name = "child-name";
// Child class has two methods m1() & m2
    public void m2(){
        System.out.println("Child()");
    }
}
public class InheritanceTest01 {

    public static void main(String[] args) {
        //case - 1
        Parent parent = new Parent();
        parent.m1();
        System.out.println("name : "+parent.name);
//        parent.m2(); // Compilation Error
        //case - 2
        Child child = new Child();
        child.m1();
        child.m2();
        System.out.println("name : "+child.name);
        //case - 3
        Parent parent1 = new Child();//Polymorphism
        parent1.m1();
        System.out.println("name : "+parent1.name);
        //parent1.m2();//CE

        //case - 4
       // Child child1 = new Parent(); //CE
    }
}
