import java.util.Scanner;
public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int num = in.nextInt();
        int temp = 0;
        while (num > 0) {
        int rem = num % 10; 
            if (rem > temp) {
                temp = rem;
            }
            
            num =num/10;
        }
        
        System.out.println("The largest digit is: " + temp);
    }
}

  