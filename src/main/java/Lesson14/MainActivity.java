package Lesson14;

import java.util.Arrays;

import static Lesson14.TaskArrayOne.checkArray;
import static Lesson14.TaskArrayTwo.resultArray;

public class MainActivity {

    public static void main(String[] args) {
        //TODO: Task out 1
        // Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
        // Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
        // идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
        // иначе в методе необходимо выбросить RuntimeException. Написать набор тестов для этого
        // метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

        System.out.println("__________________________Task 1_____________________________");
        int searchedNumber = 4;
        int[] sourceArray = {1, 2, 4, 4, 2, 3, 1, 4, 1, 7};
        int[] result = resultArray(sourceArray, searchedNumber);
        System.out.println(Arrays.toString(result));

        //TODO: Task out 2
        // Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной
        // четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4
        // варианта входных данных). [ 1 1 1 4 4 1 4 4 ] -> true [ 1 1 1 1 1 1 ] -> false [ 4 4 4 4 ] ->
        // false [ 1 4 4 1 1 4 3 ] -> false

        System.out.println("__________________________Task 2______________________________");
        System.out.println(checkArray(new int[] {1, 1, 4, 1}, 1, 4)); // true
        System.out.println(checkArray(new int[] {1, 1, 1, 1}, 1, 4)); // false
        System.out.println(checkArray(new int[] {4, 4, 4, 4}, 1, 4)); // false
        System.out.println(checkArray(new int[] {1, 2, 3, 4}, 1, 4)); // false
        System.out.println("____________________The End - Java Core для Android_____________");
    }

}
