//Program for reading input from file and displaying on console 
import java.io.*;
class FileInput{
    public static void main(String args[]){
        try{
            FileInputStream fis=new FileInputStream("C:/Users/user/OneDrive/Documents/Notes/Java/a.txt");
            //fis will not create a new file it will open the existing file
            int n;
            while((n=fis.read())!=-1){
                System.out.print((char)n);          //n will get ascii of characters in files we have to typecast
            }
            
            /* 
            byte b[]=fis.readAllBytes();            //It will get all characters together to the bytes array
            System.out.print(new String(b));        //here "new String(b)" is used to convert byte array to String
            */

            /*
            byte b[]=fis.readNBytes(5);             //It will take 5 character at a time from file
            System.out.print(new String(b));        //It will print characters in multiple of 5 
            */
            
            fis.close();                            //closing the file
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
