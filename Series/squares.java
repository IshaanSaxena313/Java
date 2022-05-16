class squares{
    public static void main(String args[]){
        int term=1,cnt=1,n=5;
        while(cnt<=n){
            System.out.print(term*term+",");
            cnt++;
            term++;
        }
        System.out.print("\b ");
    }
}
/*
Series:-
1,4,9,16,25
*/