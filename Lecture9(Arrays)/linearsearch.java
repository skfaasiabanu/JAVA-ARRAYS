import java.util.*;
public class linearsearch
{
    public static int linear(int marks[],int key){
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==key)
            {
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[])
    {
        int marks[]=new int[100];
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=5;i++)
        {
            marks[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int index=linear(marks,key);
        if(index==-1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element index"+index);
        }


    }
}