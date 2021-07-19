package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		System.out.println("================");
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]); //0,0 ~ 1,2
			}
		}
		
		char [][] alphabets = new char[13][2];
		char ch = 'A';
		for (int i=0; i<alphabets.length; i++) {
			for (int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
			}
		}
		
		for (int i=0; i<alphabets.length; i++) {
			for (int j=0; j<alphabets[i].length; j++) {
				System.out.println(alphabets[i][j]);
			}
		}
	}
	
}
