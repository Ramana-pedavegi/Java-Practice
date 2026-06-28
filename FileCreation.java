import java.io.File;
import java.io.IOException;
public class FileCreation {

    public static void main(String[] args) {
        try{
                    File f1 = new File("D:\\Text1 Files\\resume.txt");
                    if(f1.createNewFile()){
                        System.out.println("File Created :"+f1.getAbsolutePath());
                    }else{
                        System.out.println("File is already exist");
                    }

        }catch(IOException e){
            System.out.println("An error occured");

        }
        
    }
    
}
