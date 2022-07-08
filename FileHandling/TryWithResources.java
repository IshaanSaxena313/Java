//This is a better program for file copying
//It is called try with resources in this resources open by the try block will be closed by itself
import java.io.*;
class TryWithResources {
    public static void main(String args[]){
        try                 
        (   
            FileInputStream fis=new FileInputStream("a.txt");
            FileOutputStream fos=new FileOutputStream("b.txt");
        ){
            byte []b=fis.readAllBytes();
            fos.write(b);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }    
}
