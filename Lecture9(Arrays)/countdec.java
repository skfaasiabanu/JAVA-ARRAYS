

import java.util.*;
public class countdec
{  public static void sort(int numbers[])
{
    //for count array length we should find maximum number
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++)
    {
        largest=Math.max(largest,numbers[i]);
    }
    int count[]=new int[largest+1];
    for(int i=0;i<numbers.length;i++)
    {
        count[numbers[i]]++;
    }
    //sorting
    int j=0;
    for(int i=count.length-1;i>=0;i--)
    {
        while(count[i]>0)
        {
            numbers[j]=i;
            j++;
            count[i]--;
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