package task0820;

public class Dog {
    private static int count=0;
    private static final String  basedName="Dog";
    String name;
    public Dog(String name) {
        this.name=name;
        count++;
    }

    public Dog() {
        this.name=basedName+count;
        count++;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
