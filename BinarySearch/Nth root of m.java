
//Coding ninja

// You are given two positive integers N and M. You have to find the Nth root of M i.e. M^(1/N).
// Note:
// N'th root of an integer M is a real number, which when raised to the power N gives M as a result.

// N'th root of the M should be correct up to 6 decimal places.

import java.io.*;
class GFG {
    private static double multiply(double number, int n) {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * number;
        }
        return ans; 
    }
    private static void getNthRoot(int n, int m) {
        double low = 1;
        double high = m;
        double eps = 1e-6; 
        
        while((high - low) > eps) {
            double mid = (low + high) / 2.0; 
            if(multiply(mid, n) < m) {
                low = mid; 
            }
            else {
                high = mid; 
            }
        }
        
        System.out.println(n+"th root of "+m+" is "+low);  
        
    }
	public static void main (String[] args) {
		int n = 3, m = 27; 
		getNthRoot(n, m); 
	}
}



//GFG

// function NthRoot() which takes n and m as input parameter and returns the nth root of m. If the root is not integer then returns -1.


class Solution
{
     private  double pow(double number, int n) {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * number;
        }
        return ans; 
    }
    
    public int NthRoot(int n, int m)
    {
        // code here
        int l=1;
	    int h=m;
	    while(l<=h)
	    {
	        int mid=(l+h)/2;
	        if(pow(mid,n)==m)
	        return mid;
	        else if(pow(mid,n)>m)
	        h=mid-1;
	        else
	        l=mid+1;
	    }
	    return -1;
    }
}
