import java.util.Scanner;

public class AgeCustomException {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            if(age<0){
              throw  new CustomException ("Age not be negative");
    
            }
        } catch (Exception e) {
        System.out.println("Error: "+e.getMessage());
        }finally{
                    sc.close();
                System.out.println("Code ended");
        }
        sc.close();
    }
    
}
