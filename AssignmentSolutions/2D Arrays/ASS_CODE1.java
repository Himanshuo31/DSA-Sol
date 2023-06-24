import java.util.Scanner;
import java.io.*;
public class ASS_CODE1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Enter no. of rows");
        int m=scan.nextInt();

        System.out.println("Enter no. of columns");
        int n=scan.nextInt();
        
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        int positive=0, negative=0,zero=0,even=0,odd=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(arr[i][j]>0) positive++;
               if(arr[i][j]<0) negative++;
               if(arr[i][j]==0) zero++;
               if(arr[i][j]%2==0) even++;
               if(arr[i][j]%2!=0) odd++;
               

            }
            
        }
                System.out.println("No. of positive:"+positive);
                System.out.println("No. of negative:"+negative);
                System.out.println("No. of zero:"+zero);
                System.out.println("No. of even:"+even);
                System.out.println("No. of odd:"+odd);

    }
}
