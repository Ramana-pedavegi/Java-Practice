public class ExceptionHandlingTry_Catch1 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 0;
        int result =0;
    try{
        result = num1/num2;
        }catch(Exception e){
            System.out.println("Catch block");
            System.out.println("Result is:"+result);
                        e.printStackTrace();

        }  
        finally{
            System.out.println("Finally block");
        }      
        
    }
}
