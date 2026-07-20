#include <string>
#include <algorithm>
class Solution {
public:
    int maxVowels(string s, int k) {
        int window=0;
        int start=0;
        int end=k;
        for(int i=start;i<end;i++){
            if( (s[i]=='a') || (s[i]=='e') ||  (s[i]=='i') || (s[i]=='o') || (s[i]=='u'))
            window+=1;
        }
        int ans=window;
        for(int i=end;i<s.size();i++){
            if( (s[i]=='a') || (s[i]=='e') ||  (s[i]=='i') || (s[i]=='o') || (s[i]=='u'))
            window+=1;
            if( (s[start]=='a') || (s[start]=='e') ||  (s[start]=='i') || (s[start]=='o') || (s[start]=='u'))
            window-=1;
            ans=max(window,ans);
            start++;
        }
        return ans;
    }
};