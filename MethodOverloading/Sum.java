//Method overloading
/*
Types of method overloading:- 
1. Different number of arguments.
2. Different types of argument.
3. Different order of arguments.
Note:- Return type do not depend on method overloading.
*/
import java.util.Scanner;
class A{
  int sum(int a,int b){
      return a+b;
  }
  int sum(int a,int b,int c){
      return a+b+c;
  }
  public static void main(String args[]){
      Scanner sc-new Scanner(System.in);
      A a1=new A();
      int a,b,c;
      System.out.println("Enter 3 nubers:- ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      System.out.ptintln("Sum of 3 number is "+a1.sum(a,b,c));
      System.out.ptintln("Sum of 2 number is "+a1.sum(a,b));
  }
}
