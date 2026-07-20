class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;

        for(int i=0;i<numRows;i++){
            vector<int> ans1;
            ans1.push_back(1);
            if(ans.size()>0){
                for(int j=0;j<ans[ans.size()-1].size()-1;j++){
                    ans1.push_back(ans[ans.size()-1][j]+ans[ans.size()-1][j+1]);
                }
                ans1.push_back(1);
            }
            
            ans.push_back(ans1);
        }
        return ans;
    }
};