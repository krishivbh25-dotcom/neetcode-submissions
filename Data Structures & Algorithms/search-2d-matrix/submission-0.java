class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
     if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int start = 0;
        int end = rows * cols - 1; // Virtual end index

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Map 1D index to 2D coordinates
            int row = mid / cols;
            int col = mid % cols;
            
            if (matrix[row][col] == target) {
                return true; // Element found
            } else if (matrix[row][col] < target) {
                start = mid + 1; // Search right half
            } else {
                end = mid - 1; // Search left half
            }
        }

        return false;} // Element not found
    }