//Swap 2 numbers(without input)
class Swap{
	public static void main(String args[]){
		int a=5,b=6,temp;
		System.out.println("Before swap "+a+","+b);
		temp=a;
		a=b;
		b=temp;
		System.out.print("After swap "+a+","+b);
	}
}