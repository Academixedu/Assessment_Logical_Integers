import java.util.Scanner;
public  class FindNum{
// Prepare a Logic to find out 2nd  number in a set of number 
  // Let's Take a Number in Scanner
  // Example if you take 235 as number it should return 3
  // Likewise Logic you have written should get 2nd digit of any number
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number");
  String a=sc.nextLine();
  System.out.println(a.charAt(1)); 
  }
 }

