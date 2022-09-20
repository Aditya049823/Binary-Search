//Searching a Number in a sorted Matrix using Binary Search.
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
        static int rowAns,colAns;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=0;i<t;i++)
                        {
                                rowAns=-1;
                                colAns=-1;
                                int n =sc.nextInt();
                                int x=sc.nextInt();
                                int [][]mat=new int[n][n];
                                for(int j=0;j<n;j++)
                                        {
                                                for(int k=0;k<n;k++)
                                                        {
                                                                mat[j][k]=sc.nextInt();
                                                        }
                                        }
                                searchInMat(mat,x,n);
                                System.out.println(rowAns+" " +colAns);
                        }
	}
        public static void searchInMat(int mat[][],int x,int n)
        {
                int i=0;
                int j=n-1;
                while(i<n && j>=0)
                        {
                                if(mat[i][j]>x)
                                        j--;
                                else if(mat[i][j]<x)
                                        i++;
                                else
                                {
                                       rowAns=i;
                                        colAns=j;
                                        return;
                                }
                        }
        }
}