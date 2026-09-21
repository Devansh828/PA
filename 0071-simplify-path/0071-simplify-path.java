class Solution {
    public String simplifyPath(String path) {
        String[] pt=path.split("/+");
        Stack<String> stack=new Stack<>();

        for(String p:pt){
            if(p.equals("") || p.equals(".")) continue;

            if(p.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else stack.push(p);
        }

        StringBuilder res=new StringBuilder();
        for(String s:stack){
            res.append("/");
            res.append(s);
        }

        if(res.length()==0) return "/";

        return res.toString();


    }
}