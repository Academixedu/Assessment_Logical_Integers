import java.util.Scanner;

public class FindEven{
// Prepare a Logic to find out that a Digit in a Number should be Even Digit and Print Even Digit
  // 1298
  // if we take above number it should print 2 and 8 because both are even digits in a number
  
  public static void main(String[] args) {
    int num = 1298;
    while (num > 0) {
        int digit = num % 10;//8,9
        num = num / 10;//129
        if (digit % 2 == 0) { 
            System.out.print(digit + " ");
        }
    }
  }
  }

