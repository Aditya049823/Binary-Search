import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int ans=sqrRoot(n);
		System.out.println(ans);
	}
	public static int sqrRoot(int n)
	{
	    int l=1;
	    int r=n/2;
	    int sqr=0;
	    int result=0;
	    int mid;
	    if(n<2)  //sqrRoot of 0 is 0 & 1 is 1.
	    {
	        return n;
	    }
	    while(l<=r)
	    {
	        mid=(l+r)/2;
	        sqr=mid*mid;
	        if(sqr==n)      // checking for a perfect square.
	        {
	            return mid;
	        }
	        else if(sqr<n)
	        {
	            l=mid+1;
	            result=mid;  // it will return a floor value in case if perfect sqr does not exist.
	        }
	        else
	        {
	            r=mid-1;
	        }
	    }
	    return result;
    }
}
