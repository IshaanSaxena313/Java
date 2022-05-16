class Pattern6 {
    public static void main(String args[]){
        int n=5,i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print((char)(j+96)+" ");
                j++;
            }
            System.out.println();
            i++;
        }    
    }
}
/*
Pattern:-
a
a b
a b c
a b c d
a b c d e
*/