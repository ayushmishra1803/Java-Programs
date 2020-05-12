import java.util.Scanner;

class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        int vcount = 0;
        int ccount=0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                        vcount=vcount+1;
            }
            else if(s.charAt(i)==' ')
            {
                            }
            else{
                ccount=ccount+1;
            }
        }
        System.out.println("count of the vowel in the sentence= "+vcount);
        System.out.println("count of the consonant int the sentence=  "+ccount);
    }
}