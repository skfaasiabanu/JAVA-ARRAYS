

import java.util.*;
public class sumsubarrays
{
    public static int sales(int prices[])
    {
        int buying=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buying<prices[i])
            {
                int profit=prices[i]-buying;
                maxprofit=Math.max(maxprofit,profit);
            }
            else
            {
                buying=prices[i];
            }
        }
        return maxprofit;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int prices[]=new int[6];
        for(int i=0;i<prices.length;i++)
        {
            prices[i]=sc.nextInt();
        }
        
    System.out.println("the maximum profit:"+sales(prices));
    }
}