import java.util.*;
public class largest
{

    public static int getLargest(int array[])
    {
        int large=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<array.length;i++)
        {
            if(large<array[i])
            {
                large=array[i];
            }
        }
        return large;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        
        System.out.println("greatest number is:"+getLargest(array));

    }
}