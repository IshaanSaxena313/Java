class Pattern2 {
    public static void main(String args[]){
        int i=1,n=5;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }    
}
/*
Pattern:-
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/