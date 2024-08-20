package MultiLevelInheritance;

public class DriverClass {
    public static void main(String[] args) {
      BikeClass bike1=new BikeClass("AP37 AT9331","Kakinada","Bike","Ganesh","Male","Warangal",98233.98,817826938);
      bike1.BikeDetails();
        //bike1.VehicleDetails();
        Insurance ins1=new Insurance("AP37 AT9331","Khammam","Scooty","Ravi","Male","Chennai",
                876364.45,792364834,"23 jan 2023","Normal","Yes","No");
       ins1.VehicleDetails();
        ins1.InsuranceDetails();
    }
}
