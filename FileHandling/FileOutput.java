//Program to print given data to the file
import java.io.*;
class FileOutput {
    public static void main(String args[]){
        try{
            FileOutputStream fos=new FileOutputStream("C:/Users/user/OneDrive/Documents/Notes/Java/a.txt");
            /*FieOutputStream will always create a new fileusing above constructor
                                            or            
            FileOutputStream fos=new FileOutputStream("C:/Users/user/OneDrive/Documents/Notes/Java/a.txt",true);
            Using the above constructor we can append data to the existing file
            */

            String str;
            Console con=System.console();
            str=con.readLine();
            fos.write(str.getBytes());
            fos.close();                        //closing the file
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
