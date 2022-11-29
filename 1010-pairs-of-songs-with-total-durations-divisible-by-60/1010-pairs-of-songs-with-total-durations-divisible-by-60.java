class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        if(time == null || time.length == 0) return 0;
        
        int n = time.length;
        int[] map = new int[60];
        int res = 0;
        for(int i = 0; i < n; i++){
            int remainder = time[i] % 60;
            map[remainder]++;
        }
        
        res += Math.max(map[0] / 2 * (map[0] - 1), map[0] * ((map[0] - 1) / 2));
        res += Math.max(map[30] / 2 * (map[30] - 1), map[30] * ((map[30] - 1) / 2));
        for(int i = 1; i < 30; i++){
            res += map[i] * map[60 - i];
        }
        
        return res;
    }
}