// Check Whether an Alphabet is Vowel or Consonant
import java.util.*;
class check{
    public static void main(String[] args) {
        System.out.println("Enter the Alphabet");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if( a =='a'| a =='e'| a =='i'| a =='o'| a =='u')
        {
            System.out.println("The Alphabet Entered is vowel");
        }
        else
        {
            System.out.println("The Alphabet Entered is Consonant");
        }
    }
}