// Checking weather user entered an alphabet or not

import java.util.Scanner;
class check{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char a=sc.next().charAt(0);
        int num=a;
        if(num>=97 && num<=122 || num>=65 &&num<=90)
        {
            System.out.println("Entered the char is the alphabet");
        }
        else
        {
            System.out.println("Entered char is not an alphabet");
        }
    }
}