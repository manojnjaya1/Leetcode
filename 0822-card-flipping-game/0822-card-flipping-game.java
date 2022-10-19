class Solution {
    public int flipgame(int[] f, int[] b) {
         HashSet<Integer> same = new HashSet<>();
        for (int i = 0; i < f.length; ++i) if (f[i] == b[i]) same.add(f[i]);
        int res = 3000;
        for (int i : f) if (!same.contains(i)) res = Math.min(res, i);
        for (int i : b) if (!same.contains(i)) res = Math.min(res, i);
        return res % 3000;
    }
}