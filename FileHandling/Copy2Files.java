import java.io.*;
class Copy2Files {
    public static void main(String args[]){
        try
        (
            FileInputStream fis1=new FileInputStream("a.txt");
            FileInputStream fis2=new FileInputStream("b.txt");
            FileOutputStream fos=new FileOutputStream("c.txt");
            SequenceInputStream sis=new SequenceInputStream(fis1,fis2);         //Using this class we can read 2 files continously
                                                                                //It takes InputStream type as argument
        ){
            int n;
            while((n=sis.read())!=-1){
                fos.write(n);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }    
}
