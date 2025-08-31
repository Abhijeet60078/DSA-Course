import java.util.*;
import java.util.HashSet;
public class FindDuplicateNUmber {
    public static void main(String[] args){
        int[] arr={1,3,4,2,2};
        System.out.println(Duplicate(arr));


    }
    public static int Duplicate(int[] arr){
        HashSet<Integer> m=new HashSet<>();
        for(int num:arr){
            if(m.contains(num)){
                return num;
            }
            m.add(num);
        }
        return -1;


    }
}
