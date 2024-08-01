import java.util.Scanner;

public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int largestDigit = LargeDigit(num);
        System.out.println("The largest digit is: " + largestDigit);
    }

    public static int LargeDigit(int num) {
        int count = 0;
        while (num > 0) {
          //1782
            int digit = num % 10;//2
            if (digit > count) {
                count = digit;
            }
            num = num / 10;
        }
        
        return count;
    }

  }
