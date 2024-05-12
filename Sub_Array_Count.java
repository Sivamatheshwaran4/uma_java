package Practices;

public class Sub_Array_Count {

	public static void main(String[] args) {
		 int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
 		int k=3, count=0;
		for(int i=0; i<arr.length; i++) {
			int sum =0;
			for(int j=i; j<arr.length; j++) {
				sum = sum +arr[j];		
			if(sum==k) {
				count++;
				System.out.println("index [" + i + "," + j + "]");
				
			}
		}
		}
		System.out.println("Total SubArray : " + count);
	}

}
