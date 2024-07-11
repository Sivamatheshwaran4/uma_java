package Practices;

import java.util.Arrays;
import java.util.List;

public class Positive_Nagative_Count_Array {
    public static void main(String[] args) {
            int []array={10,20,50,-20,-40};
            
          long PositiveEleCount =  Arrays.stream(array).filter(f -> f>0).count();
          System.out.println("PositiveEleCount :" + PositiveEleCount);
           
          long PositiveEleSum = Arrays.stream(array).filter(f -> f>0).mapToLong(e -> e).sum();
          System.out.println("PositiveEleCountSum : " + PositiveEleSum);
          
          double PositiveEleAvg = Arrays.stream(array).mapToDouble(e -> e).average().getAsDouble();
          System.out.println("PositiveEleCountSumAvg : "+ PositiveEleAvg);
    }
}
