
import java.util.Scanner;

public class Swapping {
	static int temp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first number");
		int a = sc.nextInt();
		System.out.println("enter your second number");
		int b = sc.nextInt();
		System.out.println("print before swapping:"+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("print after swapping:"+a+" "+b);

        sc.close();
	}

}

    

