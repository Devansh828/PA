import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Leetcode989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ls=new ArrayList<>();
        int carry=0;
        for(int i=num.length-1;i>=0;i--){
            int r=k%10;
            int sum=num[i]+r+carry;
            ls.add(sum%10);
            carry=sum/10;
            k=k/10;
        }
        while(k!=0){
            int r=k%10;
            int sum=r+carry;
            ls.add(sum%10);
            carry=sum/10;
            k=k/10;
        }
        if(carry>0) ls.add(carry);
       
        Collections.reverse(ls);
        return ls;
    }
}