class A{
	static int sum(int ... a){                      //"..." represents that number of arguments are variable for the method
		int s=0;
		for(int i=0;i<a.length;i++)
			s+=a[i];
		return s;
	}
	public static void main(String args[]){
		System.out.println(sum(3,4,5,6));
		System.out.println(sum(3,4));			//any nuber of arguments can be passed to "sum" method it will be received by method in form of array
	}                                               //number_of_arguments >= 0
}
