import java.util.*;
public class distinct
{
    public static boolean check(int numbers[])
    {
        boolean ele=true;
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]==numbers[j])
                {
                    return true;
                }
    
            }
        }
        return false;
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
   System.out.println(check(numbers));
    }
}