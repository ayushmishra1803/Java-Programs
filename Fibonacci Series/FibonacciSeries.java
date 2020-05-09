// Printing Fibonacci Series

import java.util.*;
class  FibonacciSeries
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number You want to print the partten to");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=0;
        int l=1;
        System.out.print(f+" ");
        System.out.print(l +" ");
        for(int i=1;i<a;i++)
        {
         int sum=f+l;
            System.out.print(sum+" ");
            f=l;
            l=sum;
        }
    }
}