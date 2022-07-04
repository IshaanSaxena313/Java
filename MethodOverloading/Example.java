class A{
	static float sum(float a,float b){
		return a+b;
	}
	public static void main(String args[]){
		System.out.println(sum(5,6));					//no error upcast allowed
		System.out.println(sum(5.0f,6.0f));				//exact match
		System.out.println(sum(5,6,7));					//error(number of arguments not match)
		System.out.println(sum(5.0,6.0));				//error downcast not allowed
	}
}
