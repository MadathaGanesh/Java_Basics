package HierarchicalInheritance;

public class BikeClass extends VehicleClass {
    private String OwnerName;
    private String OwnerGender;
    private String OwnerAddress;
    private double price;
    private long OwnerNumber;
    public BikeClass(String OwnerName,String OwnerGender,String OwnerAddress,double price,long OwnerNumber,
                     String VehicleRegdno,String VehicleManufacturePlace,String VehicleType) {
        super(VehicleRegdno,VehicleManufacturePlace,VehicleType);
        this.OwnerName=OwnerName;
        this.OwnerGender=OwnerGender;
        this.OwnerAddress=OwnerAddress;
        this.price=price;
        this.OwnerNumber=OwnerNumber;
    }

    public void BikeDetails(){
        System.out.println("\nBike Details are :: ");
        System.out.println("Bike Owwner name is : "+OwnerName);
        System.out.println("Owner gender is : "+OwnerGender);
        System.out.println("Owner Address is : "+OwnerAddress);
        System.out.println("Bike price is : "+price);
        System.out.println("Owner Number is : "+OwnerNumber);
    }

}
