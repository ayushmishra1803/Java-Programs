// Count Number of Digits in an Integer
import java.util.Scanner;
class count{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int num=0;
        while  (a>0)
        {
            num=num+1;
            a=a/10;
        }
        System.out.println("Entered number has "+num);
    }
} 