package CompositionInJava;

public class LibraryClass {
    private double LibraryCapacity;
    private int NoOfBooks;
    private FloorClass floor;

    public LibraryClass(double LibraryCapacity,int NoOfBooks,FloorClass floor){
        this.LibraryCapacity=LibraryCapacity;
        this.NoOfBooks=NoOfBooks;
        this.floor=floor;
    }

    public double getLibraryCapacity() {
        return LibraryCapacity;
    }

    public int getNoOfBooks() {
        return NoOfBooks;
    }

    public FloorClass getFloor() {
        return floor;
    }
    public void LibrarayDetails(){
        System.out.println("Library Details are :: ");
        System.out.println("No of Books is :: "+getNoOfBooks());
        System.out.println("Library capacity is :: "+getLibraryCapacity());
        System.out.println("No of floors is :: "+getFloor());
    }

}
