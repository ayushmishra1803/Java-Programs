import java.util.Scanner;

class pyramid
{
    public static void main(String[] args) {
        System.out.println("Enter the numeber of rows");
       Scanner  sc=new Scanner(System.in);
       int x=sc.nextInt();
       for(int i=0;i<x;i++)
       {
           for(int j=0;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.print("\n");
       }
    }
}
