import java.util.Scanner;

public class Fibanocii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
         int num1 = 0;
         int num2 = 1;
         int sum =0;
         for(int i=0; i<=n; i++){
            sum = num1 + num2 ;
            num1 = num2;
            num2 = sum;
         }
         System.out.println("Fibanocci number is :"+sum);
         sc.close();
    }
    
}
