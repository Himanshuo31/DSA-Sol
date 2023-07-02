import java.util.*;
import java.io.*;
import java.lang.*;
public class ASS_CODE1_LS {



    public static int linearSearch(int[] arr,int x)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
               return i;
            }
        }
         return -1;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add");
        int n=scan.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
       System.out.println("Enter the element to be searched in the array");
       int x=scan.nextInt();
       //function calling 
      int result= linearSearch(arr,x);
       if(result==-1)
       {
        System.out.println("Element is not found in the array");
       }    
       else
       {
        System.out.println("Element is found at the location"+result);
       }   

    }
}
