public class ASSI_CODE4
 {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};

        int arr_size,n,i,second;
        arr_size=arr.length;
        int largest=second=Integer.MIN_VALUE;

        for(i=0;i<arr_size;i++)
        {
         largest=Math.max(arr[i], largest);
        }
         for(i=0;i<arr_size;i++)
        {
         if(arr[i]!=largest)
         second=Math.max(arr[i], second);
        }
        if(second==Integer.MIN_VALUE)
        {
            System.out.printf("There is no second "+"largest element/n");
        }
        else
        System.out.printf("%d\n",second);








    }
 }