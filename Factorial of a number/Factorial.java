//Calculating the Factorial of  a particular  number

import java.util.Scanner;
class Factorial
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int a=sc.nextInt();
        System.out.println("Factores are");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println(i);
            }
        }
    }
}