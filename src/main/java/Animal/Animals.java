package Animal;

import figur.Shape;

public  abstract class Animals  implements Comparable <Animals>{
    private String name;
    private int age;
    double weight;

    public Animals(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public abstract double getFoodCalculation();
    public double getWeight() {return weight;};

    @Override
    public int compareTo(Animals other) {
        return Double.compare(this.getFoodCalculation(), other.getFoodCalculation());
    }
}
