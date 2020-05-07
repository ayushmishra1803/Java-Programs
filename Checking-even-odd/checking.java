//Checking number enter by the user is even or odd
import java.util.*;
class checking{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a %2==0)
        {
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }
}
