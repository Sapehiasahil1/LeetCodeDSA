class Solution {
   public int minimumTotal(List<List<Integer>> triangle) {
       
		int[][] dp = new int[triangle.size()][triangle.size() + 1];
       
		for(int i = triangle.size() - 1; i >= 0; i--) {
			for(int j = 0; j < triangle.get(i).size(); j++) {
				if(i == triangle.size() - 1)
					dp[i][j] = triangle.get(i).get(j);
				else {
					int p1 = triangle.get(i).get(j) + dp[i + 1][j];
					int p2 = triangle.get(i).get(j) + dp[i + 1][j + 1];
					dp[i][j] = Math.min(p1, p2);
				}
			}
		}

		return dp[0][0];
	}
		
}