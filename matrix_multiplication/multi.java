import java.util.Scanner;

class multi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row of the array");
        int x=sc.nextInt();
        System.out.println("Enter the column in the array");
        int y=sc.nextInt();
        int a[][]=new int [x][y];
        int b[][]=new int [x][y];
        int c[][]=new int [x][y];
        System.out.println("Enter the array");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                for(int k=0;k<y;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

}