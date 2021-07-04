package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAI;

    private static int mLength;


public static void main(String[] args){
    while (true) {
        System.out.print("Please enter field size X and Y from 3 or more, and win length separated by space >>> ");
        int sizeX = SCANNER.nextInt();
        int sizeY = SCANNER.nextInt();
        int len = SCANNER.nextInt();
        playRound(sizeX, sizeY, len);
        System.out.printf("SCORE IS: HUMAN   AI\n            %d     %d\n", scoreHuman, scoreAI);
        System.out.print("Wanna play again? Y or N >>> ");
        if (!SCANNER.next().toLowerCase().equals("y")) break;
    }

}

    private static void playRound(int sizeX, int sizeY, int len) {
        initField(sizeX, sizeY, len);
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkGameState(DOT_HUMAN)) break;
            aiTurn();
            printField();
            if (checkGameState(DOT_AI)) break;
        }
    }

    private static boolean checkGameState(char dot){
    if (checkDraw()) return true;

    if (checkWin(dot, 0)){
        if (dot == DOT_HUMAN){
            System.out.println("Human win!");
            scoreHuman++;
        } else {
            System.out.println("AI win!");
            scoreAI++;

        }
        return true;
      }
       return false;
    }



    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++){
                if (isCellEmpty(y, x)) return false;

            }
        }

        System.out.println("Ooops.. It's Draw! ");
        return true;

    }


    /*
     ***** Сделать более умного ИИ
     */
    private static void aiTurn() {
        if (scanField(DOT_AI, mLength)) return;
        if (scanField(DOT_HUMAN, mLength)) return;
        if (scanField(DOT_AI, mLength - 1)) return;
        if (scanField(DOT_HUMAN, mLength - 1)) return;
        if (scanField(DOT_AI, mLength - 2)) return;
        if (scanField(DOT_HUMAN, mLength - 2)) return;
        aiTurnEasy();
    }

    private static void aiTurnEasy() {
        int x;
        int y;

        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));

        field[y][x] = DOT_AI;
    }

    private static boolean scanField(char dot, int length) {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) {
                    field[y][x] = dot;
                    if (checkWin(dot, length)) {
                        if (dot == DOT_AI) return true;
                        if (dot == DOT_HUMAN) {
                            field[y][x] = DOT_AI;
                            return true;
                        }
                    }
                    field[y][x] = DOT_EMPTY;
                }
            }
        }
        return false;
    }



/** Переделать проверку победы с циклами
* * Сделать проверку победы на поле 5x5 и длина последовательности 4
* **Сделать проверку на произвольные размеры поля и длину последователь
* */

private static boolean checkWin(char dot, int length) {
    for (int y = 0; y < fieldSizeY; y++) {            // проверяем всё поле
        for (int x = 0; x < fieldSizeX; x++) {
            if (checkLine(x, y, 1, 0, length, dot)) return true;    // проверка  по +х
            if (checkLine(x, y, 1, 1, length, dot)) return true;    // проверка по диагонали +х +у
            if (checkLine(x, y, 0, 1, length, dot)) return true;    // проверка линию по +у
            if (checkLine(x, y, 1, -1, length, dot)) return true;    // проверка по диагонали +х -у

        }
    }
    return false;
}


// проверка линии
private static boolean checkLine(int x, int y, int incrementX, int incrementY, int len, char dot) {
    int endXLine = x + (len - 1) * incrementX;            // конец линии по Х
    int endYLine = y + (len - 1) * incrementY;            // конец по У
    if (!isCellValid(endYLine, endXLine)) return false;    // Выход линии за пределы
    for (int i = 0; i < len; i++) {                    // идем по линии
        if (field[y + i * incrementY][x + i * incrementX] != dot) return false;    // символы одинаковые?
    }
    return true;
}


    private static void humanTurn() {
    int x, y;
        do{
            System.out.print("Please enter coordinates of your turn x & y splitted with whitespace >>>");
            x = SCANNER.nextInt() -1;
            y = SCANNER.nextInt() -1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));
        field[y][x] = DOT_HUMAN;
    }

    private  static  boolean isCellValid(int y, int x) {
    return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }


    private static  boolean isCellEmpty(int y, int x) {
    return field[y][x] == DOT_EMPTY;
    }


    private static void initField(int sizeX, int sizeY, int len) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        mLength = len;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField(){
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++){
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++){
                System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }


        for (int i = 0; i <= fieldSizeX * 2 + 1; i++){
            System.out.print("_");
        }
        System.out.println();


    }
}
