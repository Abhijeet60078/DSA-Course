public class Pattern12{
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n){
            int space=n-row;
            int s=1;
            while(s<=space){
                System.out.print("  ");
                s=s+1;
            }
            int count=1;
            while(count<=(2*row)-1){
                if(count%2==1){
                    System.out.print("! ");
                }
                else{
                    System.out.print("* ");
                }
                count++;
            }
            System.out.println();
            row=row+1;
        }



    }
}

