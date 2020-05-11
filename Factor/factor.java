
//Factor of the number of entered by the user

import java.util.Scanner;

class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println("factor"+i);
           
            }
        }
    }
}