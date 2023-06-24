import java.util.*;
import java.io.*;

public class ASS_CODE2
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
          System.out.println("Enter no. of rows or no. of columns");
        
        int n=scan.nextInt();
        System.out.println("Enter elements of square matrix");
         int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
          for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              if(i==0 && j<=(n-1)/2  || j==0 && i<=(n-1)/2  && (i+j)<=(n-1)/2)
              {
                System.out.print(arr[i][j]+" ");
              }
            }
        }
         
    }
}