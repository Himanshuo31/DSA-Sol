import java.util.Scanner;

public class ASS_CODE3 {
 public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter no. of rows or columns of matrix");
    int n=scan.nextInt();
    System.out.println("Enter elements of matrix");
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
           if(i==j || i==0 && j==n-1 || j==0 && i==n-1)
           {
            System.out.print(arr[i][j]+" ");
           }

        
        }
    }
    
 }
}
