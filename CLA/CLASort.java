class CLASort{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++)
			arr[i]=Integer.parseInt(args[i]);             //copying CLA array into local array while parsing values from String to int.
		for(int i=0;i<args.length-1;i++)                //sorting logic
			for(int j=i+1;j<args.length;j++)
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		for(int e:arr)                                  //for-each loop
			System.out.print(e+"\t");
	}
}


/* In CMD
javac FileName.java
java CLASort 5 4 1 3 2

OUTPUT:- 1 2 3 4 5
*/
