import java.util.Scanner;
public class FindSum{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number:");
      int num =  sc.nextInt();
      int sum=0;
      String strnum = Integer.toString(num);
        for (int i = 0; i < strnum.length(); i++) {
            if ((i + 1)==1 || (i + 1) == 3 || (i + 1) == 5 || (i + 1) == 7)  {
                sum += strnum.charAt(i) - '0';
            }
        }
        System.out.println("The sum of prime placed digits is: " + sum);
    }
}


