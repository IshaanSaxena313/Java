class A{
	A(){												//default constructor
		System.out.println("Default constructor");
	}
	A(int n){											//parametrized constructor
		this();											//it is used to call constructor inside constructor(must be 1st line)
		System.out.println("Parametrized constructor");
	}
}
class ATest{
	public static void main(String []args){
		A a1=new A(5);									//parametrized constructor called
	}
}


/*OUTPUT:-
Default constructor
Parametrized constructor
*/
