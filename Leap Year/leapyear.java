// Find the the Year is a Leap Year or not

import java.util.*;
class leapyear
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int a=sc.nextInt();
        if(a%4==0)
        {
            System.out.println("It is Leap year");
        }
        else{
            System.out.println("It is not a Leap year");
        }
    }
}