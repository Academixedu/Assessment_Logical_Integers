import java.util.Scanner;

public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  public static void main(String[] args){
    int max=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int num = sc.nextInt();
    while(num>0){
      int digit = num%10;
      if(digit > max){
        max = digit;
      }
      num = num/10;
    }
    System.out.println(max);
  }
  }
