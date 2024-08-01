import java.util.Scanner;

public class FindOdd{
// Prepare a Logic to print odd didgit in anumber
  // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
  // 1 
  // 2
  // 5
  // This will be the output since they are in odd positions
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = s.nextInt();

    int position = 1;
    while (num > 0) {
        int digit = num % 10;
        if (position % 2 == 0) {
            System.out.print(digit + " ");
        }
        num = num / 10;
        position++;
    }
}


}
