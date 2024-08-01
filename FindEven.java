import java.util.*;
public class FindEven{
// Prepare a Logic to find out that a Digit in a Number should be Even Digit and Print Even Digit
  // 1298
  // if we take above number it should print 2 and 8 because both are even digits in a numb

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter number");
    int a =sc.nextInt();     
          Digits(a);
    }

    public static void Digits(int number) {
        String sc = Integer.toString(number);
        
        for (int i = 0; i < sc.length(); i++) {
            char digitChar = sc.charAt(i);
            int digit = Character.getNumericValue(digitChar);
              if (digit % 2 == 0) {
                System.out.println(digit);
            }
        }
    }
}
