

// This code will return the ASCII value of the character entered by the user

import java.util.Scanner;

class ASCII{
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int ascii=a;
        System.out.println("ASCII value of the char: "+a +" "+"is: "+ascii);
    }
}