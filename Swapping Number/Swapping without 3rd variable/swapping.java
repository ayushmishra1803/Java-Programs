// Swapping of the 2 Number without using 3rd variable 
import java.util.*;
class swapping{
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Entered number are a="+a+" "+"b="+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Entered number are a=" + a + " " + "b=" + " " + b);

    } 
}