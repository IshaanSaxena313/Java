//MAX of numbers using Variable Arguments
class A{
	static int max(int ... a){
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
	public static void main(String args[]){
		System.out.println(max(5,4,1,3,2));
	}
}
							  
