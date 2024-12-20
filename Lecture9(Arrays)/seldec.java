

import java.util.*;
public class seldec
{  public static void sort(int numbers[])
{

    for(int i=0;i<numbers.length-1;i++)
    {
        int minpos=i;
        for(int j=i+1;j<numbers.length;j++)
        {
            if(numbers[minpos]<numbers[j])//numbers[minpos] is current position
            {
                minpos=j;
            }
        }
        int temp=numbers[minpos];
        numbers[minpos]=numbers[i];
        numbers[i]=temp;
    }

}
public static void print(int numbers[])
{for(int i=0;i<numbers.length;i++)
{
    System.out.print(numbers[i]);
}

}
  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numbers[]={2,3,1,4,5};
    sort(numbers);
    print(numbers);
    }
}