import java.util.Scanner;

public class Basic {
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
         int a = (n-k)*10000;
        System.out.println(a);
        sc.close();
	}
}

    

