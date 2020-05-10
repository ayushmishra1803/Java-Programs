// printing prime number bwt 2 interval

import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j==0)
                {
                    count =count +1;
                }

            }
            if(count==2)
            {
                System.out.print("Prime " +i+", ");
            }
        }
    }
}