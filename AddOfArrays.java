public class AddOfArrays {


	public static void main(String[] args) {
		int[][] arr = {{1,2,1},{9,7,2},{7,6,4}};
		int[][] arr1 = {{2,6,8},{0,1,3},{1,2,4}};
		int[][] arr2 = new int [3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println( );
	}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println( );	

}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr2[i][j]= arr[i][j]+arr1[i][j];
			}
			
}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println( );
		}
}
}
    

