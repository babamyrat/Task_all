package Lesson14;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TaskArrayTwo {

        public static int[] resultArray(int[] sourceArray, int searchedNumber) {

            int index = IntStream.range(0, sourceArray.length)
                    .map(i -> sourceArray.length - 1 - i)
                    .filter(i->sourceArray[i]==searchedNumber)
                    .findFirst().orElseThrow(()->new RuntimeException());

            int[] result = new int[sourceArray.length-index-1];
            System.arraycopy(sourceArray, index+1, result, 0, sourceArray.length-index-1);
            return result;

        }

    }
