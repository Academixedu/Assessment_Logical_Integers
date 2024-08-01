
// Prepare a Logic to find out 2nd  number in a set of number 
  // Let's Take a Number in Scanner
  // Example if you take 235 as number it should return 3
  // Likewise Logic you have written should get 2nd digit of any number
import java.util.Scanner;
public class num {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("enter the number");
                String a=in.nextLine();
              if (a.length()< 2){
                System.out.println(" the second number is not found ");
              }            
              else{
                char second = a.charAt(1);
                System.out.println("the second number is " + second );
              }
                         
            }




        }
     


