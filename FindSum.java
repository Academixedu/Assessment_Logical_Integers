import java.util.Scanner;

public class FindSum{
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578 as a Number we should consider 3+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your Number:");
    String number = in.nextLine();

    int sum = 0;
    
    for (int i = 0; i < number.length(); i++) {
        if (isPrime(i + 1)) {
            int digit = Character.getNumericValue(number.charAt(i));
            sum += digit;
        }
    }
    
    System.out.println("The sum of digits at prime positions is: " + sum);
}
public static boolean isPrime(int n) {
  if (n <= 1) return false;
  for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
  }
  return true;
}
}
