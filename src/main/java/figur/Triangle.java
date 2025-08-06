package figur;

public class Triangle extends Shape{

    private double base;
    private double height;


    @Override
    public double getAreaCalculation() {
        return 0.5 * height * base;
    }
}
