class cubes {
    public static void main(String args[]){
        int term=1,cnt=1,n=5;
        while(cnt<=n){
            System.out.print(term*term*term+",");
            cnt++;
            term++;
        }
        System.out.print("\b ");
    }    
}
/*
Series:-
1,8,27,64,125
*/