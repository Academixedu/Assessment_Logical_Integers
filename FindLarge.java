import java.util.Scanner;

public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner

  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int num = s.nextInt();

  int largestDigit = 0;
  while (num > 0) {
      int digit = num % 10;
      if (digit > largestDigit) {
          largestDigit = digit;
      }
      num = num / 10;
  }
  System.out.println("The largest digit is: " + largestDigit);
}
}
  
