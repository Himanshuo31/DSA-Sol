import java.util.Scanner;

public class ASS_CODE4_BS {
    public static int lastOccurrence(int[] arr,int target,int low)
    {
      int result=-1;
      int high=arr.length-1;
      while(low<=high)
      {
       int mid=low+(high-low)/2;
       if(arr[mid]==target)
       {
        result=mid;
        low=mid+1;
       }
       else if(arr[mid]<target)
       {
        low=mid+1;
       }
        else
        {

            high =mid-1;
        }
      }
      return result;
        
    }
    public static int firstOccurrence(int[] arr,int target,int low)
    {
      int result=-1;
        int high=arr.length-1;
      while(low<=high)
      {
       int mid=low+(high-low)/2;
       if(arr[mid]==target)
       {
        result=mid;
         high=mid-1;
       }
       else if(arr[mid]<target)
       {
        low=mid+1;
       }
        else
        {

            high =mid-1;
        }
      }
      return result;
        
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
                
          System.out.println("Enter the target");
          int target=scan.nextInt();


          int last =lastOccurrence(arr,target,0);
         
          
          int first=firstOccurrence(arr,target,0);

           
          if(first==last && last==-1)
          {
            System.out.println("The target doesn't exist in the array");
          }
          else
          {
            System.out.println( "The frequency of the given element is:"+ (last-first+1));
          }
    }
}
