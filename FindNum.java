import java.util.Scanner;
public class FindNum{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number:");
      String strnum=sc.nextLine();
      System.out.println("The Second Digit is:  "+strnum.charAt(1));
    }
}
