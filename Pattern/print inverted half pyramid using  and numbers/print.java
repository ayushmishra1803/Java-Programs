import java.util.Scanner;

class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of you want to print");
        int a = sc.nextInt();
        for (int i = a - 1; i >= 0; i--) 
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}