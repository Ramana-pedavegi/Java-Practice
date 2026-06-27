public class NumberFormatException {
    public static void main(String[] args) throws Exception{
        String str="123";
        try{
            int num = Integer.parseInt(str);
            System.out.println("converted integer :"+num);
        }catch(Exception e){
            System.out.println("catch block");
        }finally{
            System.out.println("finally block");
        }

        }
        
    }
    

