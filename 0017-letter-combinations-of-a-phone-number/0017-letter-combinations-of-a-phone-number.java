class Solution {
    

    void help(String digits,List<String> ans,StringBuilder s,int i,String[] phone){
        if(i==digits.length() || s.length()==digits.length()){
            ans.add(new String(s.toString()));
            return;
        }

        int index=digits.charAt(i)-'0'-2;

        for(int j=0;j<phone[index].length();j++){
            s.append(phone[index].charAt(j));
            help(digits,ans,s,i+1,phone);
            s.setLength(s.length()-1);
        }

    }


    public List<String> letterCombinations(String digits) {
        String[] phone=new String[8];
        phone[0]="abc";
        phone[1]="def";
        phone[2]="ghi";
        phone[3]="jkl";
        phone[4]="mno";
        phone[5]="pqrs";
        phone[6]="tuv";
        phone[7]="wxyz";


        List<String> ans=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        help(digits,ans,s,0,phone);

        return ans;

    }
}