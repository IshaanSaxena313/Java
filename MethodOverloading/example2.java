class A{
	static float sum(float a,float b){
		return a+b;
	}
	static long sum(long a,long b){
		return a+b;
	}
	public static void main(String [] args){
		System.out.println(sum(5,6));				//It will call function with "long" bcoz it is of same family
	}
}

/*
	    FAMILIES
byte           |        float
short          |       double
int            |
long           |
INTEGER FAMILY   FLOATING FAMILY
