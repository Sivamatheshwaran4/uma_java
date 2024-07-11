package Practices;
import java.util.Arrays;

public class copyOfOneArrayToAnotherArray {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int [] arr2=arr1.clone();
        int [] arr3 = new int[arr1.length];
        int index = 0;
        
        System.out.println(Arrays.toString(arr2));
        
        for (int i=0;i<arr1.length;i++){
                arr3[index++]=arr1[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
