
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  import java.util.Scanner;
public class large {

        // prepare a Logic to findout Large digit in given Number
          // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
          // Take Number By using Scanner
             public static void large(int number){
                int larger=0;
                String numStr = Integer.toString(number);
        

                for (char ch : numStr.toCharArray()) {
                
                    int digit = Character.getNumericValue(ch);
                                     
            if(digit > larger){
                larger = digit;
                
            }

             }
             System.out.println( "the largest number "+ larger);


          }

          public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            System.out.println(" enter the numbers");
            int number=in.nextInt();
            large(number);
              in.close();
          }
        }



  
