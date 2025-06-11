
import java.util.*;
public class StringSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].length()<arr[j].length()&&arr[j].startsWith(arr[i])){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        for(String s:arr){
            System.out.println(s);
        }

    }
}
