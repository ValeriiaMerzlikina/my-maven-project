package Animal;

public class Cat extends Animals{

    public Cat(int age,double weight){
        super("Cat", age, weight);


    }

    @Override
    public double getFoodCalculation() {
        return weight * 0.03;
    }
}
