import java.util.Scanner;

class linearSearch
{
    Scanner sc=new Scanner(System.in);
    public void SearchA1()
    {
        int i,j,n,key;
        System.out.println("Enter the  no of Elements ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the search key Element");
        key=sc.nextInt();
        for (i=0;i<n-1;i++)
        {
            if(a[i]==key)
            {
                System.out.println("present at location is "+key+ " in "+(i+1));
            }
        }
        System.out.println("Sorted array list");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }
}

public class LinearSearchinAnArray {
    public static void main(String args[])
    {
        linearSearch objArr=new linearSearch();
        objArr.SearchA1();
    }
}
