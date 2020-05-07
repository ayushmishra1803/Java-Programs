
// basic arithmetic operation eg-Addition , substation , Multiplication, divide 

import java.util.Scanner;

class arithmetic{
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Sum=a+b;
        int Sub=a-b;
        int multi=a*b;
        int div=a/b;
        System.out.println("The sum (+) of both the number is : "+Sum);
        System.out.println("The substation (-) of both the number is : " +Sub);
        System.out.println("The Multiplication (*) of both the number is : "+multi);
        System.out.println("The division (a/b) is :" +div);
    }
}