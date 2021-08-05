package Lesson14;

public class TaskArrayOne {

        public static boolean checkArray(int[] array, int value1, int value2) {
            int len = array.length;

            String result = "";

            for (int j : array) {
                result += " " + j;
            }

            String replace = result.replace(" " + value1, "");
            String replace2 = replace.replace(" " + value2, "");

            return replace.length() != array.length * 2 && replace2.length() != replace.length() * 2 && replace2.isEmpty();
        }



}

