import java .util.*;
public class inbuiltsort
{
    public static void printa(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Integer arr[]={2,3,1,4,5};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printa(arr);
        
    }
}