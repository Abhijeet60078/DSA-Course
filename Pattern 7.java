public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        int row=1;

        while(row<=n){
            int col=1;
            while(col<=m){
                if(col==1||col==m||row==1||row==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                col=col+1;
            }
            System.out.println();
            row=row+1;



        }

    }
}
