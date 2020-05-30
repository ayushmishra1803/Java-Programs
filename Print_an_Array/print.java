import java.util.*;
class print{
    public static void main(String[] args) {
        System.out.println("Enter the limit");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int [x];
        System.out.println("Enter the Array");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter array is ");
        for(int i=0;i<x;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println( "\n"+"Another  way of printing is ");
        System.out.println(Arrays.toString(a));
    }
}