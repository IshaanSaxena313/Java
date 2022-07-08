import java.io.*;
class FileCopyComplete {
    public static void main(String args[]){
        FileInputStream fis=null;          //initialised with null bcoz local members cannot remain uninitialised
        FileOutputStream fos=null;
        try{
            fis=new FileInputStream("a.txt");
            fos=new FileOutputStream("b.txt");

            byte []b=fis.readAllBytes();
            fos.write(b);

            //fis.close();            //if we close file here then in case of exception in 2nd file 1st file will
            //fos.close();            //remain open. To resolve it we have to use finally.
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            //fis.close();                //cannot be closed directly bcoz there is no guarentee that file will open
            //fos.close();
            try{
                if(fis!=null){
                    fis.close();
                }
                if(fos!=null){
                    fos.close();
                }
            }
                catch(IOException e){
                    e.printStackTrace();
                }
        }
    }
}
