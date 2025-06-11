import java.util.*;
public class SanketAndString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        String s=sc.next();
        int maxlength=Math.max(maxSubstring(k,s,'a'),maxSubstring(k,s,'b'));
        System.out.println(maxlength);


    }
    public static int maxSubstring(int k,String s,char target){
        int left=0;
        int maxChar=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)!=target){
                count++;
            }
            while(count>k){
                if(s.charAt(left)!=target){
                    count--;
                }
                left++;

            }
            maxChar=Math.max(maxChar,right-left+1);

        }
        return maxChar;
    }
}
