import java.io.File;
import java.io.IOException;
public class FileCreation1 {
    public static void main(String[] args) {
        File f2 = new File("D:\\Text1 Files\\resume2");
        try{
            if(f2.createNewFile()){
           //f2.createNewFile();
            System.out.println("Created file is :"+f2.getAbsolutePath());
        
        }else{
            System.out.println("File is already exist");
        }

    }catch(IOException e){
        System.out.println("An error occured");
    }
    
}
}


