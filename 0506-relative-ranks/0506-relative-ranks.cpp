class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        vector<int> help=score;
        sort(help.begin(),help.end());
        vector<string> ans;
        for(int i=0;i<score.size();i++){
            int index=0;
            for(int j=0;j<score.size();j++){
                if(score[i]==help[j]){
                    index=j;
                    break;
                }
            }
            index=score.size()-index;
            if(index==1)ans.push_back("Gold Medal");
            else if(index==2)ans.push_back("Silver Medal");
            else if(index==3)ans.push_back("Bronze Medal");

            else{
                ans.push_back(to_string(index));
            }
        }

        return ans;
    }
};