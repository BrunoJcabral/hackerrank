package DataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysDs {
    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        Collections.reverse(a);
        return a;

    }
}

class ArraysDsSolution {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 4, 3, 2);
        List<Integer> res = ArraysDs.reverseArray(arr);

    }
}