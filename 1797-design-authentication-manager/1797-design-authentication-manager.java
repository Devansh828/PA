// class Token{
//     String token;
//     int time;
//     Token(String t,int s){
//         token=t;
//         time=s;
//     }
// }
class AuthenticationManager {

    int timeToLive;
    // List<Token> ans;

    HashMap<String,Integer> ans;
    

    public AuthenticationManager(int timeToLive) {
        this.timeToLive=timeToLive;
        ans=new HashMap<>();
    }
    
    public void generate(String tokenId, int currentTime) {
        ans.put(tokenId,currentTime);
    }
    
    public void renew(String tokenId, int currentTime) {
        int exist = ans.getOrDefault(tokenId, 0);
        if(exist==0) return;
        exist=exist+timeToLive;
        if(currentTime<exist){
            ans.put(tokenId,currentTime);
        }

    }
    
    public int countUnexpiredTokens(int currentTime) {
        int count=0;
        // int time=0;
        for (Map.Entry<String, Integer> entry : ans.entrySet()) {
            // System.out.println(entry.getKey() + ": " + entry.getValue());
            // int exist = ans.getOrDefault(tokenId, 0);
            int exist=entry.getValue();
            if(exist==0) continue;
            exist=exist+timeToLive;
            if(currentTime<exist){
                count++;
            }
        }
        return count;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */