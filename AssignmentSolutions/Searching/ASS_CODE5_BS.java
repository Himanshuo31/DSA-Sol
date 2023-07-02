import  java.util.*;

public class ASS_CODE5_BS {

    public static boolean perfectSquare(int num)
    {
       int low=0,high=num;
     
       while(low<=high)
       {
        int mid=low+(high-low/2);
        int value=mid*mid;

        if(value==num)
        {
           
           return true;
        }
        else if(value>num){
           high=mid-1;

        }
        else
        {
            low=mid+1;
        }
       }
       return false ; 
 }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=scan.nextInt();
        
       boolean flag1=perfectSquare(num);

       if(flag1==true)
       {
        System.out.println("true");
       }
       else
       {
        System.out.println("false");
       }
    }
}
