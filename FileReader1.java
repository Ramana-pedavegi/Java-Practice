import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Test files\\Textfile.txt.txt");
            FileReader fr = new FileReader(file);
            int asciicode;
            while((asciicode=fr.read())!=-1){
                System.out.print((char)asciicode);
            }
            fr.close();
            
        }catch(IOException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    
}
