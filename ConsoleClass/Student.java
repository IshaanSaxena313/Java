import java.io.Console;
class Student{
	public static void main(String[] args){
		Console con=System.console();				//console() is a method of System class used to create object of Console class
		System.out.println("Enter roll number:- ");
		int roll=Integer.parseInt(con.readine());

		System.out.println("Enter name:- ");
		String name=con.readine();					//no need to parse bcoz alrerady int String format
													//There is no problem of flush in Console class
		
		System.out.println("Roll is:- "+roll);
		System.out.println("Name is:- "+name);
	}
}
