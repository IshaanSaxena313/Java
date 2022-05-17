/*ARRAY in java*/
/*
This program takes user input in array, sort given array and also print array.
*/
import java.util.Scanner;                           //importing package for input
class Array {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);           //creating object of scanner class for scanning input
        int arr[],n;
        System.out.print("Enter the number of elements of array:- ");
        n=s.nextInt();
        arr=new int[n];                             //memory allocating to array
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" :- ");
            arr[i]=s.nextInt();                     //input in array
        }
        //for-each loop (array output)
        for(int e:arr)
            System.out.print(e+"\t");
        //selection sorting
        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        //array output(sorted)
        for(int e:arr)
                System.out.print(e+"\t");
        s.close();                                  //closing the object of Scanner class
    }    
}
