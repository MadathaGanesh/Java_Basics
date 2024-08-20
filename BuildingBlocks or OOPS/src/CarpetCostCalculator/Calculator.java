package CarpetCostCalculator;

public class Calculator {
    Floor floor;
    Carpet caret;

    public Calculator(Floor floor, Carpet caret) {
        this.floor = floor;
        this.caret = caret;
    }

    public double getTotalCost(){
        return floor.getArea()* caret.getCost();
    }
}
