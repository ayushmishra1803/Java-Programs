import java.util.Scanner;

class array
{
    public static void main(String[] args) {
        System.out.println("Enter the array length");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int [x];
        int total =0;float average=0;
        System.out.println("Enter the array");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();

        }
        for(int i=0;i<x;i++)
        {
            total=total+a[i];
        }
        System.out.println("Total is = " +total);
        System.out.println("ASverage = "+total+"/"+"x");
        average=total/a.length;
        System.out.println(average);

    }
}