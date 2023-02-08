public class Solution {
    public int jump(int[] nums){
        int step = 0;
        for(int l = 0, r = 0; r < nums.length - 1; step++){
        	int rNew = 0;
        	for(int i = l; i <= r; i++) rNew = Math.max(rNew, i + nums[i]);
        	l = r + 1;
        	r = rNew;
        }
        return step;
    }
}