import java.util.*;
import java.io.*;
import java.lang.*;
public class ASSI_CODE3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
          
        }
        for(int j=0;j<n;j++
        )
        {
              max=Math.max(arr[j], max);
        }
        System.out.println(max);

    
    }
    
}
