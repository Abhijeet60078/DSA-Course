public class primeNumber {
    public static void main(String[] args) {
        int n=5;
        boolean flag=true;
        int div=2;
        while(div<=n-1){
            if(n%div==0){
                flag=false;

            }
            div=div+1;
        }
        if(flag==true){
            System.out.println("prime");
        }
        else{
            System.out.println("no prime");
        }



}
}
