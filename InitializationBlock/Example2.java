class A{
	{													//initialization block
		x=6;
	}
	int x;																							//int x=5;
}
class ATest{
	public static void main(String args[]){
		A a1=new A();
		System.out.println(a1.x);						//6											//5
	}
}
