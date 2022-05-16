class Pattern5 {
    public static void main(String args[]){
        int n=5,i=n;
        while(i>=1){
            int j=1;
            while(j<=i){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
/*
Pattern:-
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
