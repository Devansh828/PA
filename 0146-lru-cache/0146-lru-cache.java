class LRUCache {

    LinkedHashMap<Integer, Integer> mp;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        mp = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {
        if(!mp.containsKey(key)) return -1;

        int val = mp.remove(key);
        mp.put(key, val);

        return val;
    }

    public void put(int key, int value) {

        if(mp.containsKey(key)){
            mp.remove(key);
        }

        else if(mp.size() == capacity){
            int first = mp.keySet().iterator().next();
            mp.remove(first);
        }

        mp.put(key, value);
    }
}