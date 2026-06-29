import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        String Rev=" ";
        for(int i=str.length()-1; i>=0; i--){
            Rev+=str.charAt(i);
        }
        System.out.println("Reverse string is:"+Rev);
        sc.close();
    }
    
}
