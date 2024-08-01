import java.util.Scanner;
public class FindLarge{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
    int number=sc.nextInt();
    int num=0;
    while (number > 0) {
      int digit = number % 10;
      if (digit>num) {
        num=digit;        
      }
      number/=10;
    }
    System.out.println("The Largest digit is: "+num);   
  }
}