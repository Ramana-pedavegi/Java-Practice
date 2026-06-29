import java.io.File;
import java.io.IOException;
public class FolderFileCreation {
    public static void main(String[] args) {
        File f  = new File("./Text Files4//Resu1/");
        try{
            f.mkdirs();
            if(f.createNewFile()){
                System.out.println("Created file is :"+f.mkdirs());
            }else{
                System.out.println("File is already created");

            }
        }catch(IOException e){
            System.out.println("Error is occured");
        }
    }
    
}
