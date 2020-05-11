
//Calculator using switch casae
import java.util.*;

class claci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the oprator");
        char opertaor = sc.next().charAt(0);
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int calu = 0;

        switch (opertaor) {
            case '+':
                calu = a + b;
                break;

            case '-':
                calu = a - b;
                break;

            case '*':
                calu = a * b;
                break;

            case '/':
                calu = a / b;
                break;
        }

        System.out.println("Result ="+calu);
    }
}