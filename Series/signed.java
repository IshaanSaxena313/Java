class signed {
    public static void main(String args[]){
        int term=1,cnt=1,n=5;
        while(cnt<=n){
            System.out.print(term+",");
            term*=-1;
            cnt++;
        }
        System.out.print("\b ");
    }    
}
/*
Series:-
1,-1,1,-1,1
*/