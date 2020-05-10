import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total =0;
       System.out.println("Enter the number");
       int a=sc.nextInt();
        for(int i=1;i>0;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i % j==0)
                {
                    count=count+1;
                }
            }
            if(count ==2)
            {
                System.out.println("Prime "+i);
                total=total+1;
            }
            if(total==a)
            {
                break;
            }

        }
   
    }
}