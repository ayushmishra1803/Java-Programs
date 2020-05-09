// Reversing the number entered by the user
import java.util.*;
class reversingnumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();    
        int r=0;
        int d;
        while(a>0)
        {
            d=a%10;
            r=r*10;
            r=r+d;
            a=a/10;
        }
        System.out.println("Reversed number is "+r);
    }
}