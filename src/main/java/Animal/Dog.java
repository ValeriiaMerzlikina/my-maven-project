package Animal;

public class Dog extends Animals{


    public Dog(int age,double weight){
        super("Dog", age, weight);


    }

    @Override
    public double getFoodCalculation() {
        return weight * 0.03;
    }
}
