class Trie {
    class TrieNode{
        TrieNode child[];
        boolean ends;

        TrieNode(){
            child = new TrieNode[26];
            ends = false;
        }
    }
    TrieNode root;
    
    public Trie() {
         root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode tmp = root;
        for(char c : word.toCharArray()){
            if(tmp.child[c-'a'] == null){
                tmp.child[c - 'a'] = new TrieNode();
            }
            tmp = tmp.child[c - 'a'];
        }
        tmp.ends = true;
    }
    
    public boolean search(String word) {
        TrieNode tmp = root;
        for(char c : word.toCharArray()){
            if(tmp.child[c-'a'] == null){
                return false;
            }
            tmp = tmp.child[c - 'a'];
        }
        return tmp.ends;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode tmp = root;
        for(char c : prefix.toCharArray()){
            if(tmp.child[c -'a'] == null){
                return false;
            }
            tmp = tmp.child[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
