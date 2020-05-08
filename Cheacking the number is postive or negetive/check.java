//Checking Weather the number is positive or negative

import java.util.Scanner;

class check
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a>=0)
        {
            System.out.println("Number is Postive");
        }
        else
        {
            System.out.println("Number is negtive");
        }
    }
}