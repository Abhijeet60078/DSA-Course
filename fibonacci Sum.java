public class fibonacci {
    public static void main(String[] args) {
        int m=6;
        int a=0;
        int b=1;
        int count=1;
        int sum=0;
        while(count<=m+1){
            sum=a+b;
            
            
            a=b;
            b=sum;
            count++;
        }
        System.out.println(sum);


    }
}
