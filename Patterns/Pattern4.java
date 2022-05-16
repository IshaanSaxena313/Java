class Pattern4 {
    public static void main(String args[]){
        int i=1,n=5;
        while(i<=n){
            int j=i;
            while(j>=1){
                System.out.print(j+" ");
                j--;
            }
            System.out.println();
            i++;
        }
    }    
}
/*
Pattern:-
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/ 