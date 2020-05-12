import java.util.Scanner;

class order {
    public static void main(String[] args) {
        System.out.println("Enter the limit of the array");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String a[] = new String[x];
        for (int i = 0; i < x; i++) {
            a[i] = sc.next();
        }
        String temp = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sort array is");
        for (int i = 0; i < x; i++) {
            System.out.println(a[i]);
        }

    }
}