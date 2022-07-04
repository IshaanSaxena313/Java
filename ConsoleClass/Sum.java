import java.io.Console;
class Sum{
	public static void main(String args[]){
		Console con=System.console();				//We cannot create object of Console class bcoz it is "single ton class"(One Object Only)
		int a,b,ans;
		System.out.println("Enter 2 numbers:- ");
		a=Integer.parseInt(con.readLine());			//readLine() function is user to take input using Console class
		b=Integer.parseInt(con.readLine());			//it always takes input in String format that's why ne need to parse it into Integer
		ans=a+b;
		System.out.pritln("Sum is:- "+ans);
	}
}
