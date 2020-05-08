// Roots of a Quadratic Equation
//ax2+bx+c=0,
//where a,b and c are real numbers and 
//a≠0

import java.util.Scanner;
class Root
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the a,b,c");
        int a=sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        }
        else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.format("root1 = root2 = %.2f;", root1);
        }

        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
                    imaginaryPart);
        }

    }
}