public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        try{
                    System.out.println(arr[3]);
        }catch(Exception e){
            System.out.println("catch block");
            e.printStackTrace();
        }
        finally{
            System.out.println("finally block");
        }
    }
    
}
