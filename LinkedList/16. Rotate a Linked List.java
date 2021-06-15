Profile :https://auth.geeksforgeeks.org/user/akshayanil/practice/
Code : https://practice.geeksforgeeks.org/viewSol.php?subId=56caf4508b2334b37be82ccbd9e12986&pid=700023&user=akshayanil

TC : O(n)
SC : O(1)

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here

    int count=0;
        Node curr =head;
        while(curr.next!=null && count<k-1)
        {

            curr=curr.next;count++;
        }

    if(curr.next!=null)
    {
        Node ans = curr.next;
        Node temp =ans;
        curr.next=null;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        return ans;
    }
    return head;


    }

}

Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
