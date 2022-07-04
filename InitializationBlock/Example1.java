class A{
	int x=5;								//initialize at declare
	int y,z,m;
	{										//initialization block(called by new while creating object)
		y=6;
		z=7;
	}
}
class ATest{
	public static void main(String args[]){
		A a1=new A();
		System.out.println(a1.x+","+a1.y+","+a1.z+","+a1.m);			//5,6,7,0
	}																	//x=5(initialize) & y=6,z=7(By initialize block) & m=0(by new)
}
