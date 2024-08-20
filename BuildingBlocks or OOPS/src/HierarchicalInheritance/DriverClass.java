package HierarchicalInheritance;

public class DriverClass {
    public static void main(String[] args) {

        InsuranceClass obj1=new InsuranceClass("25 June ","Normal","Yes","Yes","AP36 AT9837","HYD","BIKE");
        obj1.InsuranceDetails();
        obj1.VehicleDetails();

        BikeClass obj2=new BikeClass("Vysh","Female","Warangal",76238.343,9072763,"TS34 TH7858","Dubai","Scooty");
        obj2.BikeDetails();
        obj2.VehicleDetails();
    }
}
