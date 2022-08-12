class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] array = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i * n + j] = matrix[i][j];
            }
        }

        Arrays.sort(array);

        return array[k - 1];  
    
    }
}