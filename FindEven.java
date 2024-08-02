public class FindEven{
// Prepare a Logic to find out that a Digit in a Number should be Even Digit and Print Even Digit
  // 1298
  // if we take above number it should print 2 and 8 because both are even digits in a number
  public static void main(String[] args) {
  int a=1298;
  while(a!=0){
    int b=a%10;
    if(b%2==0){
        System.out.println(b);
        a=a/10;
    }
  }
}
}