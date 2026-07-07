
import java.io.IOException;
import java.io.FileInputStream;
public class FileInputStream1 {
    public static void main(String[] args) throws IOException{
            try {
            FileInputStream fis = new FileInputStream("D:\\Test files\\Textfile.txt.txt");
            int asciicode;
            while((asciicode=fis.read())!=-1){
                System.out.print((char)asciicode);
            }
                    fis.close();

        }catch(IOException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
    
}
