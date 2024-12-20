import java.util.*;
public class triplets
{
    public static void check(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                for(int k=j+1;k<numbers.length;k++)
                {
                    if(i!=j && i!=k && j!=k && (numbers[i]+numbers[j]+numbers[k]==0))
                    {
                        System.out.println("["+i+","+j+","+k+"]");
                    }
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
   check(numbers);
    }
}