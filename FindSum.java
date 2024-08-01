import java.util.Scanner;

public class FindSum{
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578 as a Number we should consider 3+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner
  public static void main(String[] args) {
      

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    scanner.close();

    int sum = 0;
    int position = 1;
    while (num > 0) {
        if (isPrime(position)) {
            sum += num % 10;
        }
        num /= 10;
        position++;
    }
    System.out.println("Sum of prime-positioned digits: " + sum);
}

public static boolean isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) return false;
    }
    return true;
}
}
