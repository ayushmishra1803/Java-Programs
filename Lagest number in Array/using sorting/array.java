import java.util.Scanner;

class array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int x=sc.nextInt();
        int a[]=new int [x];
        int temp=0;
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorting");
        for(int i=0;i<x;i++)
        {
            
            System.out.println(a[i]);
        }
        System.out.println("Lagest element in Array is "+a[x-1]);


    }
}