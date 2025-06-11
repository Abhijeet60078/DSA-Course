public class PrintFOrward {
    public static void main(String[] args) {
        int n=5;
        PrintForward(n);
    }
    public static void  PrintForward(int n){
        if(n==0){
            return;
        }
        PrintForward(n-1);
        System.out.println(n);



    }

}
