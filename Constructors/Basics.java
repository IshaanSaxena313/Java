/*
Constructors are member method of class.
Name of constructor is same as the name of class.
It is called automatically when the object is created.
A class can contain multiple constructors called constructor overloading 
Default constructor is provided by compiler if we do not create any constructor
Constructors are used to reinitialise member variables in Java bcoz initialisation is done by "new"
*/
class Basics{
	private int x,y;
	Basics(){								//default constructor
		x=5;
		y=5;
	}
	public static void main(String args[]){
		Basics b=new Basics();				//It will call default constructor of Basics class as there are no arguments
		System.out.println(b.x+"\t"+b.y);
	}
}

/*OUTPUT:-  5	5
