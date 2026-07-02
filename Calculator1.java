
import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = sc.nextInt();
		System.out.println("Enter your second number");
		int b = sc.nextInt();
		System.out.println("Operators (+,-,*,/,%)");
		char op = sc.next().charAt(0);
		switch(op) {
		case('+'):
			System.out.println("result :"+(a+b));
			break;
		case('-'):
			System.out.println("result :"+(a-b));
			break;
		case('*'):
			System.out.println("result :"+(a*b));
			break;
		case('/'):
			System.out.println("result :"+(a/b));
			break;
		case('%'):
			System.out.println("result :"+(a%b));
			break;
		
		
		
		}
        sc.close();
	}

}

    

