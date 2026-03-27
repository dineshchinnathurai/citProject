
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // int age = 65;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("Eligible to vote and avail goverment fund");
            } else
                System.out.println("We are eligible to vote but not eligible to  avail government scheme");

        } else
            System.out.println("We are not eligible to vote and not eligible to  avail government scheme" );
    }

}
