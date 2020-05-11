import java.util.Scanner;

// Reversing the sentence
class reversing
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the setence");
        String s=sc.nextLine();
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}