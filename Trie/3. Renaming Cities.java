https://practice.geeksforgeeks.org/problems/renaming-cities28581833/1/?track=DSASP-Trie
// O(n*word_length)  , O(n*word_length)
// n : number of string

class Solution
{
    public static void check(String arr[],int n)
    {
        //You1r code here
        Node root = new Node();
        TreeMap<String,Integer> temp = new TreeMap<>();
        // TreeMap<Character,Node> map = new TreeMap<>();
        for(int i=0 ; i<n; i++)
        {
            int k = search(root, arr[i]);    // searching
            String s = arr[i];               // storing the arr[i], to push in temp (s,k);

            if(k==Integer.MAX_VALUE)
            {
                if(temp.containsKey(s))
                    temp.put(s,temp.getOrDefault(s,0)+1);

                System.out.print(s);

                if(temp.get(s)>1)
                    System.out.print(" " +temp.get(s));
                System.out.println();
            }
            else
            {
                for( int j=0; j<=k; j++)   // print the first k character of s
                {
                    if(j<s.length())
                    System.out.print(s.charAt(j));
                }
                insert(root,s);
                // if(temp.containsKey(s))
                //     temp.put(s,temp.getOrDefault(s,0)+1);
                if(temp.containsKey(s)){
	                int val=temp.get(s);
	                val++;
	                temp.put(s,val);
	            }
	            else
	                temp.put(s,1);

                if(temp.get(s)>1)
                    System.out.print(" "+ temp.get(s));
                System.out.println();
            }
        }
    }
    static  void insert(Node root, String s1)
    {
        for( int j =0 ; j <s1.length();j++)
            {
                char  c = s1.charAt(j);
                if(root.mp.containsKey(c)==false)
                {
                    root.mp.put(c,new Node());
                }
                root = root.mp.get(c); // travesing to next node ie the value in Map.
            }
            root.isEndOfWord = true;
    }
    static int search( Node root, String s1)
    {
        int j=0;
        for( j =0 ; j <s1.length();j++)
        {
              char  c = s1.charAt(j);
              if(root.mp.containsKey(c)==false)
                {
                    return j;
                }
                root = root.mp.get(c); // travesing to next node ie the value in Map.
          }
            if(root.isEndOfWord==false)   //  geeks already there and searching for geek.
            return j;

            return Integer.MAX_VALUE ; // eg jammu and jammu clash
    }
  }
