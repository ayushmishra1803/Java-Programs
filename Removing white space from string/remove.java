import java.util.Scanner;

class print{
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        b=a.replaceAll(" ", "");
        System.out.println("Entered Sentence is");
        System.out.println(a);
        System.out.println("New sentence is ");
        System.out.println(b);
    }
}