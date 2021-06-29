package Lesson1;

public class Task {

    public static void main(String[] args) {

        // Задание № 1
        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;

        System.out.println("Answer1:"+start(a, b, c, d));

        //Задание №2
        int a1 = 10;
        int b1 = 5;
        int c1 = a1 + b1;

        System.out.println("Answer2:" + extracted(c1));


        //Задание №3
        int a2 = -14;

        System.out.println("Answer3:" + extracted1(a2));


        //Задание №4
        int a3 = -14;

        System.out.println("Answer4:" + extracted2(a3));


        //Задание №5
        String a4 = "Бабамырат!";

        System.out.println("Answer5:" + extracted3(a4));



        //Задание №6
        int a5 = 2021;

        System.out.println("Answer6:" + extracted4(a5));


        //Задание №6 *
        int a6 = 2020;
        int b6 = a6 % 4;
        int c6 = a6 % 100;
        int d6 = a6 % 400;
        int e6 = 0;

        System.out.println("Answer6*:" + extracted(b6, c6, d6, e6));

    }


    //Задание №6 *
    private static String extracted(int b6, int c6, int d6, int e6) {
        if (!(b6==e6) || (c6==e6) && (d6==e6)) {
            String a7 = "високосный год";
            return a7;
        }  else {
            String b7 = "не високосный год";
            return b7;

        }
    }


    //Задание №6
    private static String extracted4(int a5) {

        if (!(a5 % 4 ==0) || (a5 % 100 == 0) && (a5 % 400 == 0)) {
            String b5 = "високосный год";
            return b5;
        }  else {
            String c5 = "не високосный год";
            return c5;

        }

    }


    //Задание №5
    private static String extracted3(String a4) {
        String b4 = "Привет," + a4;
        return b4;
    }


    //Задание №4
    private static boolean extracted2(int a3) {
        if (a3 < 0) {
            return true;

        } else {
            return false;

        }
    }


    //Задание №3
    private static String extracted1(int a2) {
        if (a2 > 0) {
            String b2 = "положительное число:" + a2;
            return b2;
        } else {
            String c2 = "отрицательное число:" + a2;
            return c2;
        }
    }


    // Задание  №2
    private static boolean extracted(int c1) {
        if (10 < c1 && c1 < 20) {
            return true;
        } else  {
            return false;
        }
    }


    // Задание  №1
    private static float start(float a, float b, float c, float d) {
        float mul = a * (b + (c / d));
        return mul;
    }

}
