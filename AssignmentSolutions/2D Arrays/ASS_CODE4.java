import java.util.Scanner;

public class ASS_CODE4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no. of rows of a matirx");
        int m=scan.nextInt();
        System.out.println("Enter no. of columns of a matrix");
        int n=scan.nextInt();
         System.out.println("Enter the matrix element");
         int arr[][]=new int[m][n];
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scan.nextInt();
            }
         }
         int max=Integer.MIN_VALUE;
           for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                }
            }
         }
         System.out.println(max);
         
    }
}
