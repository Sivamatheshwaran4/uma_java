package Interview_Raj;

public class Diagonal {

	public void show () {
		int[][] array = {
					{1,2,5},
					{4,5,6},
					{7,8,10}
						};
		int length = array.length;
		int col = array[0].length;	
		int sumOfDiagonal = 0;
		int sumOfSecondayDiagonal = 0;
		
		for(int i=0; i<length; i++) {
			sumOfDiagonal = sumOfDiagonal + array[i][i];	
			sumOfSecondayDiagonal = sumOfSecondayDiagonal + array[i][col-1-i];
		}		
		System.out.println("sumOfDiagonal :" + sumOfDiagonal);
		System.out.println("sumOfSecondayDiagonal : " + sumOfSecondayDiagonal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagonal obj = new Diagonal ();
		obj.show();
	}

}
