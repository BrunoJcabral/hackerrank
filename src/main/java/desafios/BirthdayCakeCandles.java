package desafios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int hightNumber = Collections.max(candles);
        int count = Collections.frequency(candles,hightNumber);

        System.out.println(count);

        return count;
    }

}

class BirthdayCakeCandlesSolution {
    public static void main(String... args){

        List<Integer> candles = Arrays.asList(82,49,82,82,41,82,15,63,38,25);

        int result = BirthdayCakeCandles.birthdayCakeCandles(candles);

    }

}
