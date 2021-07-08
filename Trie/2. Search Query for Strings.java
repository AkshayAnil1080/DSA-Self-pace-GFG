https://practice.geeksforgeeks.org/problems/search-query-for-strings5049/1/?track=DSASP-Trie&batchId=154
// TC:O(M)  , O(M)
// M = sum of the length of all strings which is present in the key[]

static void insert(String key)
{
    // Your code here
    TrieNode root1 = root;
    for(int i =0 ;i <key.length(); i++)
    {
        int index = key.charAt(i) -'a';

        if(root1.children[index] ==null)
        root1.children[index] = new TrieNode();

        root1=root1.children[index];
    }
    root1.isEndOfWord = true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(String key)
{
    // Your code here
    TrieNode root1 = root;
      for( int i =0 ;i <key.length(); i++)
    {
        int index = key.charAt(i) -'a';
        if(root1.children[index] ==null)
        return false;

        root1=root1.children[index];
    }
    return root1.isEndOfWord ;
}
