package HierarchicalInheritance;

public class InsuranceClass extends VehicleClass {
    private String insuranceLastDate;
    private String InsuranceType;
    private String License;
    private String Pollution;

    public InsuranceClass(String insuranceLastDate,String InsuranceType,String License,String Pollution,
                          String VehicleRegdno,String VehicleManufacturePlace,String VehicleType) {
        super(VehicleRegdno,VehicleManufacturePlace,VehicleType);
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
