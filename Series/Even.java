class even {
    public static void main(String args[]){
        int term=0,cnt=1,n=5;
        while(cnt<=n){
            System.out.print(term+",");
            term+=2;
            cnt++;
        }
        System.out.print("\b ");
    }    
}
/*
Series:-
0,2,4,6,8
*/
