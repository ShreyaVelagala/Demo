import java.util.Arrays;
public class Demo {
    public static int averageArray(int[] array){
        int average = 0; 
        for(int val: array){
            average += val; 
        }
        return average;
    }
}
