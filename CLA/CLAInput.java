class CLAInput{
	public static void main(String []args){
		int arr[];
		int n=args.length;
		arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(args[i]);       //Integer is pre-defined class,parseInt() is the method used to convert string to integer.
		for(int e:arr)                            //for-each loop to print array
			System.out.print(e+"\t");
	}
}
