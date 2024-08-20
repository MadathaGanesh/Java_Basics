package Method_Overriding_with_Multiple_Inheritence;

public class DriverClass {
    public static void main(String[] args) {
        Animal obj1,obj2,obj3;
        obj1=new Animal();
        obj1.details();


        obj2=new Dog();
        obj2.details();


        obj3=new BabyDog();
        obj1.details();
        obj2.details();
        obj3.details();
    }
}
