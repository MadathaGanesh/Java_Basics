package SettersAndGettersDemo;

public class ObjectClass {
    // Mobile phone features are RAM , Color , NoOfCameras ,Model
    private int Ram;
    private String Model;
    private String Color;
    private long Price;

    //Setters
    public void setRam(int ram) {
        Ram = ram;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPrice(long price) {
        Price = price;
    }

    // Gettters
    public int getRam() {
        return Ram;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public long getPrice() {
        return Price;
    }

}
