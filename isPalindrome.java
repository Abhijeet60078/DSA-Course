import java.util.*;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=s;
        String c="";
        for(int i=s.length()-1;i>=0;i--){
            c+=s.charAt(i);
        }
        if(p.equals(c)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



    }
}
