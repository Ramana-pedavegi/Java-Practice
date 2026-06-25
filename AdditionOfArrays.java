public class AdditionOfArrays {
    public static void main(String[] args) {
        int[][] a1 = {{1,2,1},{9,7,2},{7,6,4}};
        int[][] a2 = {{2,6,8},{0,1,3},{1,2,4}};
        int[][] a3 = new int[3][3];
        System.out.println("First matrix");
        for(int i =0;i<a1.length;i++){
            for(int j =0; j<a1[i].length;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println( );
        }
        System.out.println("second matrix");
        for(int i =0;i<a2.length;i++){
            for(int j =0; j<a2[i].length;j++){
                System.out.print(a2[i][j]+" ");
            }
                        System.out.println( );

        }
        for(int i =0; i<a3.length;i++){
            for(int j=0;j<a3[i].length;j++){
                a3[i][j]= a1[i][j]+a2[i][j];
            }
        }
        System.out.println("Result matrix");
        for(int i =0;i<a3.length;i++){
            for(int j =0; j<a3[i].length;j++){
                System.out.print(a3[i][j]+" ");
            }
                        System.out.println( );

        }
        
    }
    
}
