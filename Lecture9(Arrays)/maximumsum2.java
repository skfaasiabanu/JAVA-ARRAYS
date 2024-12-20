import java.util.*;
public class maximumsum2
{
    public static void kadanes(int numbers[])
    {
       int ms=Integer.MIN_VALUE;
       int cs=0;
       for(int i=0;i<numbers.length;i++)
       {
        cs=cs+numbers[i];
        if(cs<0)
        {
            cs=0;
        }
        ms=Math.max(cs,ms);
       }
       System.out.println("maximum sum is"+ms);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
        kadanes(numbers);
    }
}