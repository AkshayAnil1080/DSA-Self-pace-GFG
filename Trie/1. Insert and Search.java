https://practice.geeksforgeeks.org/problems/trie-insert-and-search0651/1/?track=DSASP-Trie&batchId=154#
// TC:O(M)  , O(M)
// M = sum of the length of all strings which is present in the key[]

static void insert(TrieNode root, String key)
{
    // Your code here
    TrieNode curr = root;
    for( int i=0;i<key.length();i++)
    {
        int index =key.charAt(i)-'a';
        if(curr.children[index] ==null)
            curr.children[index] =new TrieNode();

        curr=curr.children[index];
    }
    curr.isEndOfWord = true; // to  mark the end of the word
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
     TrieNode curr = root;
    for(int i=0;i<key.length();i++)
    {
        int index =key.charAt(i)-'a';
        if(curr.children[index] ==null)
            return false;


        curr=curr.children[index];
    }
    return curr.isEndOfWord;

}
