import java.util.Scanner;
public class FindNum{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  System.out.println("enter number : ");
  String a=s.nextLine();
  int n=Character.getNumericValue(a.charAt(1));
  System.out.println(n);
// Prepare a Logic to find out 2nd  number in a set of number 
  // Let's Take a Number in Scanner
  // Example if you take 235 as number it should return 3
  // Likewise Logic you have written should get 2nd digit of any number
}
}