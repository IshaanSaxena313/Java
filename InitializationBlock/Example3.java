/*						ERROR						*/
class A{
	int y;
	{
		x=6;										//forward initialize is allowed
		y=x;										//forward reference not allowed
	}
	int x;
}
class ATest{
	public static void main(String []args){
		A a1-new A();
		System.out.println(a1.x);					//6
	}
}
