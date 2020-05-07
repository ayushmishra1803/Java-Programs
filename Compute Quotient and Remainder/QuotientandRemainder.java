// computing quotient And Remainder


import java.util.Scanner;

class QuotientandRemainder{
    public static void main(String[] args) {
        System.out.println("Enter dividend and divisor");
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        int quotient =dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println("quotient= "+ quotient);
        System.out.println("remainder= "+ remainder);
    }
}