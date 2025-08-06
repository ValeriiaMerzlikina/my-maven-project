package figur;

public abstract class  Shape {

    private String name;
    private double x;
    private double y;
    public Shape(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }
    private void setX(double x) {
        this.x = x;
    }
    private double getX() {
        return x;
    }
    private void setY(double y) {
        this.y = y;
    }
    private double getY() {
        return y;
    }
    public abstract double getAreaCalculation();

}
