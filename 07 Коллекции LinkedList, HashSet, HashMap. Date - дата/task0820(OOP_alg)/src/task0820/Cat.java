package task0820;

public class Cat {
    private static int count=0;
    private static final String  basedName="Cat";
    String name;
    public Cat(String name) {
            this.name=name;
            count++;
    }

    public Cat() {
        this.name=basedName+count;
        count++;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
