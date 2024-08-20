package MultiLevelInheritance;

public class Insurance extends BikeClass{
    private String insuranceLastDate;
    private String InsuranceType;
    private String License;
    private String Pollution;

    public Insurance(String VehicleRegdno, String VehicleManufacturePlace, String VehicleType,
                     String OwnerName, String OwnerGender, String OwnerAddress, double price, long OwnerNumber,
                     String insuranceLastDate,String InsuranceType,String License,String Pollution) {
        super(VehicleRegdno, VehicleManufacturePlace, VehicleType, OwnerName, OwnerGender, OwnerAddress, price, OwnerNumber);
        this.insuranceLastDate=insuranceLastDate;
        this.InsuranceType=InsuranceType;
        this.License=License;
        this.Pollution=Pollution;
    }

    public void InsuranceDetails(){
        System.out.println("\n Insurance Details are : ");
        System.out.println("Insurance Last date is : "+insuranceLastDate);
        System.out.println("Insurance tYPe is : "+InsuranceType);
        System.out.println("Is there License ? "+License);
        System.out.println("Is tehre pollution : "+Pollution);
    }

}
