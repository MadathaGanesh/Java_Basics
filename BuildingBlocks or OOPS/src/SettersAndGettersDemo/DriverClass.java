package SettersAndGettersDemo;

public class DriverClass {
    public static void main(String[] args) {

        ObjectClass obj;
        obj=new ObjectClass();
        obj.setModel("Realme 7i");
        obj.setRam(8);
        obj.setColor("Green");
        obj.setPrice(12500);

        System.out.println("Mobile model is : "+obj.getModel());
        System.out.println("Mobile Ram is : "+obj.getRam());
        System.out.println("Mobile Color is : "+obj.getColor());
        System.out.println("Mobile rice is : "+obj.getPrice());
    }
}
