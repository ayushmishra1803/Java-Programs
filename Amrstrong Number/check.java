// Checking weather the number is amrstrong nummber or not
import java.util.*;
class Check{
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int c=a;
        int r=0;
        while(c>0)
        {
            int t=0;
            t=c%10;
            t=t*t*t;
            r=r+t;
            c=c/10;

        }
        if(a == r)
        {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("No");
        }
    }

}