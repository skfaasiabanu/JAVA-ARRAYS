

import java.util.*;
public class sumsubarrays
{
    public static void arrays(int numbers[])
    {   
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
              int start=i;
              for(int j=i;j<numbers.length;j++)
              {
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++)
                {
                    sum=sum+numbers[k];
                    System.out.print(numbers[k]+" ");
                    
                }
                System.out.println("sum of subarray is:"+sum);
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
                if(sum<minsum)
                {
                    minsum=sum;
                }
                System.out.println();
              }
              System.out.println();
        }
        System.out.println(maxsum);
        System.out.println(minsum);
        
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