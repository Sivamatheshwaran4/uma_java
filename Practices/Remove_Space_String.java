package Practices;
public class Remove_Space_String {
    public static void main(String[] args) {
        String str="Raja1 is2 Rajadurai3";
        
       String stringSpaceRemove= str.replaceAll("\\p{Zs}",""); // remove space
       System.out.println(stringSpaceRemove);
       
       str= str.replaceAll("\\p{L}+","");  // replace charactor
       System.out.println(str);    
       
       String str2="abc123def";
       String  NumberRemove=  str2.replaceAll("\\p{N}","");
       System.out.println(NumberRemove);

       char[] charArray=stringSpaceRemove.toCharArray();
        System.out.println(charArray.length);
    }
}
