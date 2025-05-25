public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=n;
        while(row<=n){
            int cst=1;
            while(cst<=nst){
                System.out.print("*");
                cst=cst+1;
            }
            System.out.println();
            row=row+1;
            nst=nst-1;
        }
    }
}
