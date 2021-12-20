package desafios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s){

        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat dfout = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            date = df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dfout.format(date));
        return dfout.format(date);
    }
}

class TimeConversionSolution {
    public static void main(String[] args) {


        String s = "07:05:45PM";

        String result = TimeConversion.timeConversion(s);

    }
}
