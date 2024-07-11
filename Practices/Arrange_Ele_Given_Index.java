package Practices;

public class Arrange_Ele_Given_Index {
	 public static void main(String[] args) {
	    	 String str="Raja";
	         int []index={1,0,2,3};
	       StringBuilder sb = new StringBuilder();
	        for(int i=0; i<str.length(); i++) {
	        	int k = index[i];
	        	sb.append(str.charAt(k));
	        }
	        System.out.println(sb);
	    }
}

