class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> al = new ArrayList<>();
        for(int i = 0;i<m;i++){
            int min = Integer.MAX_VALUE;
            int idx1=-1;
            for(int j=0;j<n;j++){
                if(min >= matrix[i][j]){
                     min = matrix[i][j];
                     idx1 = j;
                }
            }
            
            int max = Integer.MIN_VALUE;
            for(int j=0;j<m;j++) if(max<=matrix[j][idx1]) max=matrix[j][idx1];
            if(min==max) al.add(matrix[i][idx1]);
        }
        return al;
    }
}
