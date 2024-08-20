package CompositionInJava;

public class FloorClass {
    private int NoofFloors;
    private String FloorCapacity;

    public FloorClass(int noofFloors, String floorCapacity) {
        NoofFloors = noofFloors;
        FloorCapacity = floorCapacity;
    }

    public int getNoofFloors() {
        return NoofFloors;
    }
    public String getFloorCapacity(){
        return FloorCapacity;
    }

    public void FloorDetails(){
        System.out.println("Floor DEtails are :: ");
        System.out.println("No of floors are :: "+getNoofFloors());
        System.out.println("Floor capacity is :: "+getFloorCapacity());
    }

}
