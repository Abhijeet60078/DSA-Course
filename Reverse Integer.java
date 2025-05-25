public class ReverseInteger {
    public static void main(String[] args) {
        int n=23456;
        int ans=0;
        while(n!=0){
            int temp=n%10;
            ans=ans*10+temp;
            n/=10;
        }
        System.out.println(ans);
    }
}
