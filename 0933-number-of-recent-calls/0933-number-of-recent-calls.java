class RecentCounter {

    ArrayList<Integer> arr;

    public RecentCounter() {
        arr=new ArrayList<>();
    }
    
    public int ping(int t) {
        arr.add(t);
        int b=t;
        int a=t-3000;
        int count=0;
        for(int i=0;i<arr.size();i++){
            int x=arr.get(i);
            if(x>=a && x<=b) count++;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */