import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader1 {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Test files\\Textfile.txt.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int asciicode;
            while((asciicode=br.read())!=-1){
                System.out.print((char)asciicode);
            }
            br.close();
        }catch(IOException e){
            System.out.println("error :"+e.getMessage());
        }
    }
    
}
