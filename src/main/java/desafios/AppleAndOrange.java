package desafios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/*
Function Description

Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.

countApplesAndOranges has the following parameter(s):

s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree.
 */
public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
       /*List<Integer> applesPosition = apples.stream().map(x-> x=a+x).collect(toList());
        List<Integer> orangesPosition = oranges.stream().map(x-> x=b+x).collect(toList());
        long countApple = apples.stream().filter(x-> (a+x)>=s && (a+x)<=t).count();
        long countOrange = oranges.stream().filter(x-> (b+x)>=s && (b+x)<=t).count();
        System.out.println(countApple);
        System.out.println(countOrange);*/

        System.out.println(apples.stream().filter(x-> (a+x)>=s && (a+x)<=t).count());
        System.out.println(oranges.stream().filter(x-> (b+x)>=s && (b+x)<=t).count());

    }
}

 class AppleAndOrangeSolution {
    public static void main(String[] args) {

        int s = 7;

        int t = 11;

        String[] secondMultipleInput = {"5", "15"};

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = {"3", "2"};

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Arrays.asList(-2,2,1);

        List<Integer> oranges = Arrays.asList(5,-6);

        AppleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges);

    }
}
