/*FUNCTIONS in java*/
class Function {
    public static void main(String args[]){
        int n=5;
        int ans=fact(n);
        System.out.print("Factorial:- "+ans);
    }
    static int fact(int a){
        if(a<=1)
            return a;
        return a*fact(a-1);
    }    
}
