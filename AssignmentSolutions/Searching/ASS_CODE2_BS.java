import java.util.*;
import java.io.*;
import java.lang.*;

public class ASS_CODE2_BS {
       
      public static int binarySearch(int[] arr,int target){
      int low=0,high=arr.length-1;
          int result=-1;
      while(low<=high)
      {
        int mid=low+(high-low)/2;
     
        if(arr[mid]==target)
        {
             result=mid;
            // return mid;
            low=mid+1;
        }
        else if(arr[mid]<target)
        {
            low=mid+1;
        }

        else
        {
            high=mid-1;
        }
      }


        return result;
      }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); 
         System.out.println("Enter the number of elements you want to add");
         int n=scan.nextInt();
         System.out.println("Enter the array elments");
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
          arr[i]=scan.nextInt();
        }
        System.out.println("Enter the target");
        int target=scan.nextInt();
         int result=binarySearch(arr,target);

         if(result==-1)
         {
            System.out.println(-1);
         }
         else
         {
            System.out.println("The last occurrence of target is at index "+result);
         }
    }
}
