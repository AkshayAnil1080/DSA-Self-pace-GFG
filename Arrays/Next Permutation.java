Medium
https://practice.geeksforgeeks.org/problems/next-permutation5226/1#
https://practice.geeksforgeeks.org/viewSol.php?subId=4012bfec4dcbd6cb6780619a97c626d4&pid=705146&user=akshayanil
class Solution{

    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        List<Integer> al = new ArrayList<>();
        int i =0;
        for(i = n-1; i>0; i--)
        {
            if(arr[i] >arr[i-1])
            break;
        }
        // eg 218765 - > i=2;
        if(i==0)  // descending arr
        {
            Arrays.sort(arr);
            for( int j=0; j<n; j++)
            {
                al.add(arr[j]);
            }
            return al;
        }
        else
        {
            int com=arr[i-1]; int min=Integer.MAX_VALUE ; int minIndex =-1;
            for( int j=i;j<n;j++)
            {
                if(com<arr[j])
                {
                    if(min > arr[j])
                    {
                        min =arr[j];
                        minIndex=j;  //min =5
                    }
                }
            }
            //swap
            int temp =arr[i-1];
            arr[i-1] =arr[minIndex];
            arr[minIndex] = temp;
            // become 258761
            // sort i -> n
            Arrays.sort(arr,i,n);  // 251678 - Ans

        }

        for(  i =0 ;i<n ;i++)
        {
            al.add(arr[i]);
        }
        return al;

    }
}
