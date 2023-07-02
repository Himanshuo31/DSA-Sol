import java.util.Scanner;
public class ASS_CODE3_BS {
public static int binarySearch(int[] binaryArray)
{
   int n=binaryArray.length;
   int low=0;
   int high=n-1;

   while(low<=high)
  {
    int mid=low+(high-low)/2;
    if(mid==0)
    {
        low=mid+1;
    }
    else
    {
        high=mid-1;
    }
  }  


   

   return  n-low;

}


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to add");
        int n=scan.nextInt();
        int count=0;
        System.out.println("Enter the array element");
        int binaryArray[]=new int[n];
        for(int i=0;i<n;i++)
        {
         binaryArray[i]=scan.nextInt(); 
        }
        int result=binarySearch(binaryArray);
        if(result==-1)
        {
            System.out.println("No one's present in the array");
        }
        else
        {
        System.out.println("Number of one's present in the array is:"+result);
        }    
    }
}

