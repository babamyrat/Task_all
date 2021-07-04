package Lesson5;

public class Cat {
    String name;
    String color;
    int age;

    public void voice() {
        System.out.printf("Cat %s meaw\n", name);
    }

    public void printInfo() {
        System.out.printf("Cat: %s, color: %s, age: %d\n", name, color, age);
    }

}
