

import java.util.*;
public class bubblesort
{  public static void sort(int numbers[])
{
    for(int i=0;i<numbers.length-1;i++)
    {
        for(int j=0;j<numbers.length-1-i;j++)
        {
            if(numbers[j]>numbers[j+1])
            {
                int temp=numbers[j];
                numbers[j]=numbers[j+1];
                numbers[j+1]=temp;
            }
        }
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
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
    sort(numbers);
    print(numbers);
    }
}