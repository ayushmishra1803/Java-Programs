import java.util.Scanner;

class print{
    public static void main(String[] args) {
        System.out.println("Enter the number you want to print");
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
        char alpha='a';
    
    for(int  i=1;i<=a;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(alpha);
        }
        System.out.print("\n");
        alpha= (char) (alpha + 1);
    }
    }
}