package task0726;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int tailLength;

    Cat(String name, int age, int weight, int tailLength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
    }
}
