class Pattern7 {
    public static void main(String args[]){
        int n=5,i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=i){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
            i++;
        }
    }    
}
/*
Pattern:-
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
*/
