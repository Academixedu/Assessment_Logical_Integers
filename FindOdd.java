import java.util.Scanner;

public class FindOdd{
// Prepare a Logic to print odd didgit in anumber
  // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
  // 1 
  // 2
  // 5
  // This will be the output since they are in odd positions
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
      num =num / 10;
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
  
