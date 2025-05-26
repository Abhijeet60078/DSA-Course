public class Pattern6{
    public static void main(String[] args) {
        int n = 5;
        int nsp = 0;
        int nst = n;
        int row = 1;

        while (row <= n) {

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("     ");
                csp++;
            }


            int cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }

            System.out.println();
            nsp=nsp+1;
            nst=nst-1;
            row=row+1;
        }
    }
}
