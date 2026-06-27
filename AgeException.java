import java.util.Scanner;

public class AgeException {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try{
            if(age<0){
                throw new Exception("Age cannot be negative");
            }
            System.out.println("enter valid age");
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
        finally{
                sc.close();

            System.out.println("code ended");
        }
    }
    
}
