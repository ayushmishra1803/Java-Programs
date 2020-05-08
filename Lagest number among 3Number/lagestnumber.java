//Finding the largest number among 3
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class lagestnumber
{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the 3 Number");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>b && a>c)
      {
          System.out.println(a+" is the Greatest");
      }
      else if (b>c && b>a)
      {
         System.out.println(b + " is the Greatest");
      }
      else
      {
          System.out.println(c + " is the Greatest");
      }
  }
}