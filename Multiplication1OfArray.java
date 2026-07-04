public class Multiplication1OfArray {


	public static void main(String[] args) {
		int[][] arr= {{2,3,5},{0,1,3},{1,2,4}};
		int[][] arr1=new int [3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println( );
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr1[i][j]= arr[i][j]*arr[i][j]; {
			}
		}
		
}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println( );
}
}
}
    

