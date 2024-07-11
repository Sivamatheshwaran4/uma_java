package Practices;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CountTheUpperCaseLetters {
    public static void main(String[] args) {
        String str="Raja LovEe RaNi";
        long countFlt = str.chars()  // Get IntStream of characters
                .filter(Character::isUpperCase)  // Filter uppercase characters
                .count();
        System.out.println(countFlt);
        
        int count=0;
        for (char c:str.toCharArray()){
            if (Character.isUpperCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
