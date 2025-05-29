public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n){
            int nsp=row-1;
            int nst=2*(n-row)+1;
            int col=1;
            while(col<=nsp){
                System.out.print(" ");
                col++;
            }
            int pow=1;
            while(pow<=nst){
                System.out.print("*");
                pow++;
            }
            System.out.println();
            row=row+1;

        }



    }
}
