package DataStructures;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TwodArray {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {

        int max = -64; // min negative value possible
        int r = arr.size();
        int c = arr.get(0).size();
        for(int i=0;i<r-2;i++) {
            for(int j=0;j<c-2;j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                        + arr.get(i+1).get(j+1)
                        + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

}

class TwodArraySolution {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = TwodArray.hourglassSum(arr);
        System.out.println(result);

    }
}