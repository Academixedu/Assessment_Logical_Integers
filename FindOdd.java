
import java.util.Scanner;
public class odd {
        // Prepare a Logic to print odd didgit in anumber
          // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
          // 1 
          // 2
          // 5
          // This will be the output since they are in odd positions
          public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            System.out.println("enter the number");
            String numberStr = in.nextLine();

            for (int i = 0; i < numberStr.length(); i++) {
               
                if ((i + 1) % 2 != 0) {
                   
                    System.out.println(numberStr.charAt(i) + "  is an odd number ");
                }
            }
        }
    }
