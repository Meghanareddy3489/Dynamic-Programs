
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int result=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
			   int prod=1;
			   for(int k =i;k<=j;k++){
                  prod*=arr.get(k);
			   }
			   result=Math.max(prod,result);
		   }
		}
		return result;
	}
}

Input:
