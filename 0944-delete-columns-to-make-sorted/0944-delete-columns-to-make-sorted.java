class Solution {
    public int minDeletionSize(String[] strs) {
        
        int deletions = 0;
        for (int column = 0; column < strs[0].length(); column++) {
            char prev = 'a';
            for (int row = 0; row < strs.length; row++) {
                if (strs[row].charAt(column) < prev) {
                    deletions++;
                    break;
                }
                prev = strs[row].charAt(column);
            }
        }
        return deletions;
    }
}
