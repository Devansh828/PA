class MyHashSet {

    List<Integer> ls;

    public MyHashSet() {
        ls=new ArrayList<>();
    }
    
    public void add(int key) {
        boolean cont=contains(key);
        if(!cont){
            ls.add(key);
        }
    }
    
    public void remove(int key) {
        if(ls.isEmpty()) return;
        ls.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        boolean ans=false;
        for(int a:ls){
            if(a==key) {
                ans=true;
                break;
            }
        }
        return ans;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */