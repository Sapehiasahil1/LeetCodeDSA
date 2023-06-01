class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        boolean visited[] = new boolean [isConnected.length];
        int count = 1;
        
        helper(isConnected, 0, visited, count);

        for(int i=0;i<isConnected.length;i++){

            if(visited[i]==false){
                count = count+1;
                helper(isConnected, i, visited, count);
            }
        }
        return count;
    }

    public int helper(int [][] isConnected, int cv, boolean visited[], int count){


        visited[cv] = true;

        for(int i=0;i<isConnected.length;i++){

            if(visited[i]== false && isConnected[cv][i]== 1 ){
                helper(isConnected, i, visited, count);
            }
        }
        return count;
    }
}