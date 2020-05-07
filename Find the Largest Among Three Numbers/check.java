// Find the Largest Among Three Numbers
import java.util.*;

import javax.lang.model.util.ElementScanner6;
class check{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" Is the Largest or all");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" Is largest of all");
        }
        else
        {
            System.out.println(c+" largest of all");
        }
    
    }
}
