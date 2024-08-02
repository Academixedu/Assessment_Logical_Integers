import java.util.Scanner;

public class FindSum{
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578 as a Number we should consider 3+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner
    public static void main(String[] args) {
      Scanner sd = new Scanner(System.in);
      System.out.print("Enter a Number:");
      int num =  sd.nextInt();
      int sum=0;
      String strnum = Integer.toString(num);
        for (int i = 0; i < strnum.length(); i++) {
            if ((i + 1)==1 || (i + 1) == 3 || (i + 1) == 5 || (i + 1) == 7)  {
                sum += strnum.charAt(i) - '0';
            }
        }
        System.out.println(" prime placed digits is: " + sum);
    }
}


