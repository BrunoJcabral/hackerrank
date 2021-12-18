package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> ordenado = arr.stream().sorted().collect(toList());
        Long max = ordenado.subList(1,ordenado.size()).stream().mapToLong(Integer::longValue).sum();
        Long min = ordenado.subList(0,ordenado.size()-1).stream().mapToLong(Integer::longValue).sum();
        System.out.println(min + " " + max);
    }

}
 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}