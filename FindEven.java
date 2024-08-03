public class FindEven{
// Prepare a Logic to find out that a Digit in a Number should be Even Digit and Print Even Digit
public static void main(String[] args){
  int a = 1298;
  while(a>0){
      int digit = a%10;
      if(digit%2 == 0){
        System.out.println(digit);
      }
      a = a/10;
      }
    }
}
  // 1298
  // if we take above number it should print 2 and 8 because both are even digits in a number