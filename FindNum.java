import java.util.Scanner;

public class FindNum{
// Prepare a Logic to find out 2nd  number in a set of number 
  // Let's Take a Number in Scanner
  // Example if you take 235 as number it should return 3
  // Likewise Logic you have written should get 2nd digit of any number
public void seconddigit()
{
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the Number = ");
  int a=in.nextInt();
  int seconddiig=0;

  while (a>9) 
  {
    seconddiig=a%10;
    a=a/10;
  }
  System.out.println("Enter the second digit = "+ seconddiig);
  
}
public static void main(String[] args) 
{
  new FindNum().seconddigit();
}
}