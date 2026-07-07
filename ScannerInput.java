import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Test files\\Textfile.txt.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(IOException e){
            System.out.println("error : "+e.getMessage());
        }
    }
    
}
