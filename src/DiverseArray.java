import java.util.ArrayList;
import java.util.Arrays;

public class DiverseArray {

    public static int arraySum(int[] array){

        int sum = 0;

        for(int a: array){

            sum += a;

        }

        return sum;

    }

    public static int[] rowSums(int[][] array){

        int[] result = new int[array.length];

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array[i].length; j++){

                result[i] += array[i][j];

            }
        }

        return result;

    }

    public static boolean isDiverse(int[][] arr2d){

        int[] array = rowSums(arr2d);
        int[] intContain = new int[array.length];

        for(int i = 0; i < array.length; i++){

           intContain[i] = array[i];

        }

        Arrays.sort(intContain);

        for(int j = 0; j < intContain.length - 1; j++){

            if(intContain[j] == intContain[j + 1]){

                return false;
            }
        }

        return true;
    }

}
