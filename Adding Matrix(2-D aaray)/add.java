import java.util.*;
class add{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows matrix will have");
        int x=sc.nextInt();
        System.out.println("Enter the number of column matrix have");
        int y=sc.nextInt();
        int a[][]=new int [x][y];
        int[][] b = new int[x][y];
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
        System.out.println("Sum of both thew array is ");
       
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(c[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}