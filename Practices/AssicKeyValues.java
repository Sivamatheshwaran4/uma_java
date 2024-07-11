package Practices;


public class AssicKeyValues {
    public static void main(String[] args) {
        String str="Raja Love Rani";
       String name =  str.replaceAll("\\p{Zs}","");
        StringBuilder sb = new StringBuilder();
        for (char ch:name.toCharArray()){
         sb.append(ch).append(":" +(int)ch + "\n");
        }
        System.out.println(sb);
    }
}
