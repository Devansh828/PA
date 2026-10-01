class BrowserHistory {

    List<String> ans;
    int index=-1;

    public BrowserHistory(String homepage) {
        ans=new ArrayList<>();
        ans.add(homepage);
        index=0;
    }
    
    public void visit(String url) {
        ans.subList(index+1,ans.size()).clear();
        ans.add(url);
        index++;
    }
    
    public String back(int steps) {
        for(int i=steps;i>0;i--){
            if(index==0) break;
            index--;

        }
        return ans.get(index);
    }
    
    public String forward(int steps) {
        for(int i=steps;i>0;i--){
            if( index==ans.size()-1) break;
            index++;

        }
        return ans.get(index);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */