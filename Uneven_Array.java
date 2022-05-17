/*Program to implement uneven array in java*/
import java.util.Scanner;
class Uneven_Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m[][],n,x;
        System.out.print("Enter the number of students:- ");
        n=sc.nextInt();
        m=new int[n][];
        for(int i=0;i<n;i++){
            System.out.print("Enter the number of subjects cleared by student "+(i+1)+":- ");
            x=sc.nextInt();
            m[i]=new int[x];
            for(int j=0;j<x;j++){
                System.out.print("Enter marks of subject "+(j+1)+":- ");
                m[i][j]=sc.nextInt();
            }
        }
        for(int a[]:m){
            for(int e:a)
                System.out.print(e+"\t");
            System.out.println();
        }
        sc.close();
    }    
}
