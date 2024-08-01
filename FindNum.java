import java.util.Scanner;

public class FindNum{
// Prepare a Logic to find out 2nd  number in a set of number 
  // Let's Take a Number in Scanner
  // Example if you take 235 as number it should return 3
  // Likewise Logic you have written should get 2nd digit of any number
  
  public static void main(String[] args)
  {
    Scanner s= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = s.nextInt();
    int secondDigit = (num / 10) % 10;
    if (secondDigit != 0)
    {
        System.out.println("The 2nd digit is: " + secondDigit);
    }
    else
    {
        System.out.println("The number should have at least 2 digits.");
    }
  }
}


