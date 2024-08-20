package HierarchicalInheritance;

// Parent Class

public class VehicleClass {
    private String VehicleRegdno;
    private String VehicleManufacturePlace;
    private String VehicleType;

    public VehicleClass(String VehicleRegdno,String VehicleManufacturePlace,String VehicleType){
        this.VehicleRegdno=VehicleRegdno;
        this.VehicleManufacturePlace=VehicleManufacturePlace;
        this.VehicleType=VehicleType;
    }

    public void VehicleDetails(){
        System.out.println("\n Vehicle Details Are ::: ");
        System.out.println("Vehicle Regd No is :: " + VehicleRegdno);
        System.out.println("Vehicle Type is :: "+VehicleType);
        System.out.println("Vehicle Manufacture Address is ::  "+VehicleManufacturePlace);
    }

}
