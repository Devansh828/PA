class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans=new ArrayList<>();

        HashMap<String,Integer> mp=new HashMap<>();

        

        for(int j=0;j<cpdomains.length;j++){
            String[] arr=cpdomains[j].split(" ");

            int n=Integer.parseInt(arr[0]);
            
            
            String temp="";
            

            String[] sub=arr[1].split("\\.");

            for (int i = sub.length - 1; i >= 0; i--) {

                temp = sub[i] + (temp.isEmpty() ? "" : "." + temp);

                mp.put(temp, mp.getOrDefault(temp, 0) + n);
            }

        }

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            ans.add(entry.getValue() + " " + entry.getKey());
        }

        return ans;

    }
}