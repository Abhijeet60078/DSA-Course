public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n){
            int nsp=n-row;

            int col=1;
            while(col<=nsp){
                System.out.print(" ");
                col++;
            }
            int pow=1;
            while(pow<=row){
                System.out.print("* ");
                pow++;
            }
            System.out.println();
            row=row+1;

        }



    }
}
