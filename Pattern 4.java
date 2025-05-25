public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        int nsp=n-1;
        int nst=1;
        int row=1;
        while(row<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nst=nst+1;
            nsp=nsp-1;
            row=row+1;

        }
    }
}
