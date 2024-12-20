import java.util.*;
public class binarysearch
{
    public static int search(int numbers[],int key)
    {
        int start=0;
        int end=numbers.length-1;
        int mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(numbers[mid]==key)
            {
                return mid;
            }
            else if(numbers[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println("index of key is"+search(numbers,key));
        
    }
}