import java.util.*;
public class smallest
{
    public static int getSmallest(int numbers[])
    {
        int small=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(small>numbers[i])
            {
                small=numbers[i];
            }
        }
        return small;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
        System.out.println("smallest value is="+getSmallest(numbers));
    }
}
