import java.util.Scanner;

public class FindOdd{
// Prepare a Logic to print odd didgit in anumber
  // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
  // 1 
  // 2
  // 5
  // This will be the output since they are in odd positions
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter a number: ");
  String num = scan.nextLine();
  for (int i = 0; i < num.length(); i++) {
    if (num.length() >= 2) {
      char secondDigit = num.charAt(1); 
      System.out.println("The second digit is: " + secondDigit);
  } else {
      System.out.println("The number does not have a second digit.");
  }
  }
}
}
