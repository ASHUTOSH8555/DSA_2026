package HashSet;

import java.util.HashSet;

public class LongestSubsequence {
    public static void main(String[] args){
        int[] nums = {99, 100, 1, 4, 3, 200, 2};
        System.out.println(longSubsq(nums));
    }
    public static int longSubsq(int[] nums){
        HashSet<Integer> st=new HashSet<>();
        for(int num : nums) st.add(num);
        int maxln=0;
        for(int num : st){
            if(!st.contains(num-1)){
                int currNum=num;
                int currStreak=1;
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxln=Math.max(currStreak,maxln);
            }
        }
        return maxln;
    }
}
