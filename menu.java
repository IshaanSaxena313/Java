/*INPUT in java*/
/*
In this program scaner class is used to take user input.
Switch case is used to take input from user wether to sum,subtract or multiply. 
*/ 
import java.util.Scanner;
class menu {
    static int sum(int a,int b){
        return a+b;
    }
    static int subtract(int a,int b){
        return a-b;
    }
    static int mult(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);                  //memory allocate to scanner class object
        int n,a,b,ans=0;
        do{
            System.out.println("1. ADD \n2. SUBTRACT \n3. MULTIPLY \n4. EXIT \nEnter your choice:-");
            n=sc.nextInt();                                 //input using nextInt() function of scanner class
            switch(n){
                case 1:
                    System.out.println("Enter 2 numbers for addition:- ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    ans=sum(a,b);
                    break;
                case 2:
                    System.out.println("Enter 2 numbers for subtraction:- ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    ans=subtract(a,b);
                    break;
                case 3:
                    System.out.println("Enter 2 numbers for multiplication:- ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    ans=mult(a,b);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("Result:- "+ans);
        }while(n!=4);
        sc.close();                                     //closing the use of object of Scanner class
    }
}
