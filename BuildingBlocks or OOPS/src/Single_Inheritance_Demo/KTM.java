package Single_Inheritance_Demo;

public class KTM extends Properties {
    private String Model;
    private String RegdNo;
    private String Color;
    private int NoOFSeats;

    public KTM(String mileage, String fuelType, String ownerName, int noOfSeats,
               int noOfTyres, double price, String model, String regdNo, String color, int noOFSeats) {
        super(mileage, fuelType, ownerName, noOfSeats, noOfTyres, price);
        Model = model;
        RegdNo = regdNo;
        Color = color;
        NoOFSeats = noOFSeats;
    }
    public void KTMDetails() {
        System.out.println("KTM Details are ::");
        System.out.println("No of seats : " +NoOFSeats);
    }
}

