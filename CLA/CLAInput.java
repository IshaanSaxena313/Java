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


/* IN CMD
javac FileName.java            (for compiling the source code)
java CLAInput 10 20 30 40 50    (for running the code and giving the argument(command line argument)
OUTPUT:-   10 20 30 40 50 
*/
