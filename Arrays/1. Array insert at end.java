class Insert
{
    // You only need to insert the given element at 
    // the end, i.e., at index sizeOfArray - 1. You may 
    // assume that the array already has sizeOfArray - 1
    // elements. 
    public void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        //Your code here
        arr[sizeOfArray-1] = element;
    }
}

Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
element = 90
Output: 1 2 3 4 5 90
Explanation: After inserting 90 at the
end, we have array elements as 
1 2 3 4 5 90.