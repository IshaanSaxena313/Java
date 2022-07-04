class ArgsToArray{
	static int sum(int arr[]){                   //any number of arguments given to the function will become element of arr
		int s=0;							     //method is static so that we do not have to create any object for calling it
		for(int i=0;i<arr.length;i++)
			s+=arr[i];
			return s;
		}
	public static void main(String [] args){
		int a[]={3,4,5,6};						//these values will be received by array reference "arr" of the method
		System.out.println(sum(a));				//passing array reference as an argument 
		int b[]={1,2,3};
		System.out.println(sum(b));
	}
}
