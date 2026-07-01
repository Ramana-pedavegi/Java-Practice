
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		String Day = sc.nextLine();
		switch(Day) {
		case ("monday"):
			System.out.println("uff its a weekday");
		break;
		case ("tuesday"):
			System.out.println("uff its a weekday");
		break;
		case ("wednesday"):
			System.out.println("uff its a weekday");
		break;
		case ("thrusday"):
			System.out.println("uff its a weekday");
		break;
		case ("friday"):
			System.out.println("uff its a weekday");
		break;
		case ("saturday"):
			System.out.println("yeah its a weekend");
		break;
		case ("sunday"):
			System.out.println("yeah its a weekend");
		break;
		default :
			System.out.println("pls enter valid day");
		break;
		}
        sc.close();
			}

}
    

