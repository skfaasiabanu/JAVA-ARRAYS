import java.util.*;
public class argument
{

    public static void update(int marks[],int variable)
    {
        variable=10;
        System.out.println(variable);
        
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
            System.out.println(marks[i]+" ");

        }

    }
    public static void main(String args[])
    {
        
        int marks[]={97,98,99};
        int variable=5;
        
           System.out.println(variable);
        
        for(int i=0;i<marks.length;i++)
        {
           System.out.println(marks[i]+" ");
        }
        update(marks,variable);
        System.out.println(variable);
        for(int i=0;i<marks.length;i++)
        {
           System.out.println(marks[i]+" ");
        }

    }
}