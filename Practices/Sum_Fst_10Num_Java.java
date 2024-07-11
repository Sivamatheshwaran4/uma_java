package Practices;

import java.util.stream.IntStream;

public class Sum_Fst_10Num_Java {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for(int i=0; i<=num; i++){
            sum+=i;
        }
        System.out.println(sum);
        
        // How do you find sum of first 10 natural numbers?
        int result = IntStream.range(1,11).sum();
        System.out.println(result);
    }
}
