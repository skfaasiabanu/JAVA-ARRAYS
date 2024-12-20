

import java.util.*;
public class maxsum1
{
    public static void arrays(int numbers[])
    {   
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
              int start=i;
              for(int j=i;j<numbers.length;j++)
              {
                int end=j;
                int sum=0;
                sum=(start==0)?prefix[end]:prefix[end]-prefix[start-1];
              
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
                if(sum<minsum)
                {
                    minsum=sum;
                }
                System.out.println();
              
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