// Swapping java variable with the help of 3 variable

import java.util.Scanner;

class swapping {
    public static void main(String[] args) {
        System.out.println("Enter the 2 number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Value entered a="+a+" "+"b= "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("value of a after Swapping is a="+a+" "+"b="+b);
    }
}