class Solution {
   // Map<Integer, Integer> memo = new HashMap<>();
    
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char c : tiles.toCharArray()) count[c - 'A']++;
        return dfs(count);
    }
    
    int dfs(int[] arr) {
        // int key = Arrays.hashCode(arr);
        // if (memo.containsKey(key)) {
        //     return memo.get(key);
        // }
        
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) continue;
            sum++;
            arr[i]--;
            sum += dfs(arr);
            arr[i]++;
        }
        
//memo.put(key, sum);
        return sum;
    }
}