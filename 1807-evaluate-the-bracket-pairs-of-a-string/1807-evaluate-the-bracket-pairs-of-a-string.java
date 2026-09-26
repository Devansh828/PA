class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans=new StringBuilder();
        StringBuilder str=new StringBuilder();
        boolean a=false;
        Map<String,String> mp=new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            mp.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            // System.out.println(str);
            if(c=='('){
                a=true;
            }

            

            

            else if(c==')'){
                ans.append(mp.getOrDefault(str.toString(), "?"));

                str.setLength(0);
                a=false;
                
            }

            else if(a==true){
                str.append(c);
            }
            else{
                ans.append(c);
            }
        }

        return ans.toString();
    }
}