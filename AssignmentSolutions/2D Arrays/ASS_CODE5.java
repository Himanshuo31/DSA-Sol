import java.util.*;
import java.io.*;
public class ASS_CODE5{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no. of rows or columns of matrix");
        int n=scan.nextInt();
        System.out.println("Enter the element of matrix");
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

              if(i==(n-1)/2 || j==(n-1)/2)
              {
                System.out.print(arr[i][j]+" ");
              }
            }
        }


        
    }
}