// printing the multiplication table of the number entered  by the user

import java.util.*;
class MultiplicationTable
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int a=sc.nextInt();
        int table;
        for(int i=0;i<=10;i++)
        {
           table=i*a;
            System.out.println( a+" * " +i +" = "+table);
        }
        
        
    }
}