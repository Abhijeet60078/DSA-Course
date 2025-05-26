public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n){
            int col=1;
            while(col<=n){
                if(row==col||row+col==n+1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("    ");
                }
                col=col+1;
            }
            System.out.println();
            row=row+1;
        }
    }
}
