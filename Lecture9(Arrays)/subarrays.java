
import java.util.*;
public class subarrays
{
    public static void arrays(int numbers[])
    {   
        for(int i=0;i<numbers.length;i++)
        {
              int start=i;
              for(int j=i;j<numbers.length;j++)
              {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
              }
              System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
    arrays(numbers);
    }
}