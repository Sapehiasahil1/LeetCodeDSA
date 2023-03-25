class TrieNode{
    
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;
    
    public TrieNode(char data) {
        
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount =0;
    }
}

class Trie {

    private TrieNode root;
    public Trie() {
        
        root = new TrieNode('\0');
    }
    
    public void insert(String word) {
        
        insert(root,word);
    }
    
    public boolean search(String word) {
        
        return isSearch(root, word);
    }
    
    public boolean startsWith(String prefix) {
        
         TrieNode current = root;
        
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
    
    private void insert(TrieNode root, String word){
        
        
        if(word.length() ==0){
            
            root.isTerminating = true;
            return;
        }
        
        int childIndex = word.charAt(0) -'a';
        TrieNode child = root.children[childIndex];
        
        if(child == null){
            
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount ++;
            
        }
        
        insert(child, word.substring(1));
    }
    
    private boolean isSearch(TrieNode root, String word){
        
        
        if(word.length() ==0){
            
            return root.isTerminating;
            
        }
        
        int childIndex = word.charAt(0) -'a';
        TrieNode child = root.children[childIndex];
        
        if(child == null){
            
            return false;
        }
         return isSearch(child, word.substring(1));
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */