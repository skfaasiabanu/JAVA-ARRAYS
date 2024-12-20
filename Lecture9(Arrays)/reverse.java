import java.util.*;
public class reverse
{
    public static void revnumbers(int numbers[])
    {
        int first=0;
        int last=numbers.length-1;
        int temp;
        while(first<last)
        {
            temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
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
 revnumbers(numbers);
 for(int i=0;i<numbers.length;i++)
 {
    System.out.println(numbers[i]);
 }

}
}