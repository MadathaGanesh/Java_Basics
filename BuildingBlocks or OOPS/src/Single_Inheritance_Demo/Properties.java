package Single_Inheritance_Demo;

public class Properties {
    private String Mileage;
    private String FuelType;
    private String OwnerName;
    private int NoOfSeats;
    private int NoOfTyres;
    private double price;


    public Properties(String mileage, String fuelType, String ownerName, int noOfSeats, int noOfTyres, double price) {
        Mileage= mileage;
        FuelType = fuelType;
        OwnerName = ownerName;
        NoOfSeats = noOfSeats;
        NoOfTyres = noOfTyres;
        this.price = price;
    }

    public void KTMDetails(){
        System.out.println("Property details are : ");
        System.out.println("No of seats  are : "+   NoOfSeats);
    }

}
