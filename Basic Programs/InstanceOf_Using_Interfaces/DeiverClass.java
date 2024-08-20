package InstanceOf_Using_Interfaces;

public class DeiverClass {
    public static void main(String[] args) {
        Dog obj=new Dog();
        System.out.println(obj instanceof Dog);
        System.out.println(obj instanceof  Animal);
    }
}
