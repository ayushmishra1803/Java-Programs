
// Printing Armstrong number bwt 2 interval
import java.util.*;

class Print {
    public static void main(String[] args) {
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <b; i++) {
            int t = 0;
            int r = 0;
            int c = i;
            while (c > 0) {
                t = c % 10;
                t = t * t * t;
                r = r + t;
                c = c / 10;
            }
            if (i == r) {
                System.out.println("Armstrong" + i);

            }
        }

    }
}