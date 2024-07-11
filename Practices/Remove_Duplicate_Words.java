package Practices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Remove_Duplicate_Words {
    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("Siva", "Uma", "Uma", "Thambi","Vallarasu","Alaga"); // static array list
        List<String> uniqueValueOfList = listStr.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove Duplicate Words : " +uniqueValueOfList);
    //    String wordJoin = listStr.stream().distinct().collect(Collectors.joining("," ,"S","S"));

 
       
    }
}
