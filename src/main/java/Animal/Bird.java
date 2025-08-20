package Animal;

public class Bird extends Animals{


    public Bird(int age,double weight){
        super("Bird", age, weight);

    }

    @Override
    public double getFoodCalculation() {
        return weight * 0.03;
    }
}
