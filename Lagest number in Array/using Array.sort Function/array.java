import java.util.Arrays;
import java.util.Scanner;

class array
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int x=sc.nextInt();
        int a[]=new int [x];
        System.out.println("Enter the Array");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[x-1]);
}
}