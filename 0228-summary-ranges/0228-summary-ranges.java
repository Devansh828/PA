class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0)
            return ans;
        int[] help = new int[2];

        help[0] = nums[0];
        help[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (help[0] == help[1]) {
                    ans.add(new String(String.valueOf(help[0])));
                } else {
                    ans.add(new String(help[0] + "->" + help[1]));
                }
                help[0] = nums[i];
                help[1] = nums[i];
            } else {
                help[1] = nums[i];
            }
        }

        if (help[0] == help[1]) {
            ans.add(new String(String.valueOf(help[0])));
        } else {
            ans.add(new String(help[0] + "->" + help[1]));
        }

        return ans;

    }
}