package baitap;

public class Dog {
    private int id;
    private String name;
    private int age;
    private double weight;

    public Dog(){}

    public Dog(int id, String name, int age, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id= " + id +" , "+ " name = " + name +" , "+ " age = " + age +" , " +"weight = " + weight +
                '}';
    }
}
