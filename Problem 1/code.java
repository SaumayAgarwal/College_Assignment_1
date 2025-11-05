import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int n=arr.size()-1;
        m=m+1;
        while(m<n){
            int temp=arr.get(m);
            arr.set(m, arr.get(n));
            arr.set(n, temp);
            n--;
            m++;
       }
    }
}

