// TC :  theta(n)
// Aux Space : O(1)

// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList<Integer> al = new ArrayList<>(2);
        int res = -1, largest= 0;
        for( int i =1; i<sizeOfArray; i++)   
        {
            if(arr[i] > arr[largest])
            {
                res = largest;
                largest = i;   // maintaining two ptr = > one for largest and for second largest  - till the array is sorted.
            }
    //  5 8 12 | 20 => a[i]>a[largest] = > largest = i, res= largesest
    // 5 8 12 | 12 =>a[i]==a[largest] = > ignore
    //a[i] < a[largest] = >  12 12 12 |7 case where res == -1 => res = i   
                    // => 5 8 12 | 7  a[i]  < a[res]  = > ignore
                    //  1 2 7 12 | 9  a[i]  > a[res]  => res =i;
    else if(arr[i] != arr[largest])
            {
                if ( res==-1 || arr[i]>arr[res])
                res = i;
            }
            
        }
        al.add(arr[largest]);
        
        if(res!=-1)  
        al.add(arr[res]);
        else                 // suppose all elements were same eg 2 2 2 2 , here res == -1;
        al.add(-1);
        
        return al;
    }
}