public class FindEven{
// Prepare a Logic to find out that a Digit in a Number should be Even Digit and Print Even Digit
  // 1298
  // if we take above number it should print 2 and 8 because both are even digits in a number
  public static void main(String[] args) {
    int number = 1298; 
    System.out.println("Even digits in the number " + number + " are: ");
    while (number > 0) {
        int digit = number % 10; 
        if (digit % 2 == 0) {
            System.out.println(digit); 
        }
        number =number/10; 
    }
}
}
