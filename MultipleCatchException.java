public class MultipleCatchException {
    public static void main(String[] args) throws Throwable {
        int num1=4;
        int num2 = 0;
        int [] a ={1,3,5};
        int result=0;
        try{
            System.out.println(a[4]);
            result = num1/num2;
            System.out.println("result is : "+result);
        }catch(IndexOutOfBoundsException  | ArithmeticException e){
            System.out.println("ArrayIndexOutOfBoundsException is occur");
            System.out.println("Arithmatic exception occured");
        }
        
        
        finally{
            System.out.println("Finally block ");
        }
    }
    
}
