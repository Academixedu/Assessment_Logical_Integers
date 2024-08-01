import java.util.Scanner;
public class FindOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        String strnum = sc.nextLine();
        System.out.println("Digits at odd positions are:");
        for (int i = 0; i < strnum.length(); i++) {
            if ((i + 1) % 2 != 0) {
                System.out.println(strnum.charAt(i));
            }
        }
    }
}