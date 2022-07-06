//Copying data froma file to another file
import java.io.*;
class FileCopy{
    static public void main(String args[]){
        try{
            FileInputStream fis=new FileInputStream("C:/Users/user/OneDrive/Documents/Notes/Java/a.txt");
            FileOutputStream fos=new FileOutputStream("C:/Users/user/OneDrive/Documents/Notes/Java/b.txt");
            //Copying whole file at once
            byte b[]=fis.readAllBytes();
            fos.write(b);

            //Copying file character-by-character
            /*int n;
            while((n=fis.read())!=-1){
                fos.write(n);
            }*/
            
            //Copying file in group of 5 character
            /*int n;
            byte b[]=new byte[5];
            while((n=fis.read(b))!=-1){
                fos.write(b,0,n);
            }*/
            fis.close();
            fos.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
