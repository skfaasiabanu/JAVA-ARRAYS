import java.util.*;
public class pars
{
    public static void pair(int numbers[])
    {   int totalpairs=0;
        for(int i=0;i<numbers.length;i++)
        {
              int curr=numbers[i];
              for(int j=i+1;j<numbers.length;j++)
              {
                System.out.print("("+curr+","+numbers[j]+")");
                totalpairs++;
              }
              System.out.println();
        }
        System.out.println("total pairs"+totalpairs);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
        pair(numbers);
    }
}