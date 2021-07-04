package Lesson5;

public class Task5 {
    public static void main(String[] args){
        Cat c;
        c = new Cat();
        c.name = "Murzik";
        c.color = "red";
        c.age = 1;

        Cat cat = new Cat();
        cat.name = "Barsik";
        cat.color = "gray";
        cat.age = 2;

        c.voice();
        cat.voice();
        c.printInfo();
        cat.printInfo();
    }
}
