package Interview_Raj;

public class Count_Possible_3Digit {

			public void show() {
				int [] arr = {1,2,3,4};
				int count = 0 , length = arr.length ,  sum = 0;
				for(int i =0; i<length ; i++) {
					for (int j = 0; j < length; j++) {
						for (int k = 0; k < length; k++) {
							if (i != j && i != k && j != k) {
							//	sum = arr[i] * 100 + arr[j] * 10 + arr[i];
							//	System.out.println(sum);
								count++;
							}
						}
					}
				}
				System.out.println( "Count : " +count);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Possible_3Digit obj = new Count_Possible_3Digit();
		obj.show();
	}

}
