import java.util.*;
import java.util.ArrayList;
public class ChebaccaNUmber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        ArrayList<Integer> digit=new ArrayList<>();
        while(n>0){
            digit.add((int)(n%10));
            n/=10;
        }
        Collections.reverse(digit);
        for(int i=0;i<digit.size();i++){
            int d=digit.get(i);
            int t=9-d;
            if(i==0&&t==0){
                System.out.print(d);
            }else{
                if(t<d){
                    System.out.print(t);
                }else{
                    System.out.print(d);
                }
            }



        }
        
    }
}
