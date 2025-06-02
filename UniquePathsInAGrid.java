class UniquePathsInAGrid {
    public int uniquePaths(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1){
            return 0;
        };
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return solve(grid,0,0,n,m,dp);
    }
    public int solve(int [][]grid,int i,int j,int n,int m,int[][] dp){
        if(i>=n || j>=m || grid[i][j]==1){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(dp[i][j]!=-1)
            return dp[i][j];
        dp[i][j]=solve(grid,i+1,j,n,m,dp)+solve(grid,i,j+1,n,m,dp);
        return dp[i][j];
    }
};
