package figur;

public class Circle extends Shape{

    private String name;
    private double radius; // радиус круга для площади

    @Override
    public double getAreaCalculation(){
        return Math.PI * radius * radius ;
    }}

