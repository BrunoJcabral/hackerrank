package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grading {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> resultado = new ArrayList<>();

        grades.forEach(x-> {
            if(x%5==0 && x>37){
                resultado.add(x);
            }else if ((x+1)%5==0 && x>37) {
                resultado.add(x+1);
            }else if ((x+2)%5==0 && x>37){
                resultado.add(x+2);
            }else {
                resultado.add(x);
            }
        });
    return resultado;
    }
}

class GradingSolution {
    public static void main(String[] args){

        List<Integer> grades = Arrays.asList(73,67,38,33);

        List<Integer> result = Grading.gradingStudents(grades);


    }
}
