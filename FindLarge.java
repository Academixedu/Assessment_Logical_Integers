import java.util.Scanner;
public class FindLarge{
  public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("enter number");
    int num=a.nextInt();
    int maxdigit=0;
    int b;
    while(num>0){
      b=num%10;
      if(b>maxdigit){
        maxdigit=b;
      }
      num=num/10;
    }
System.out.println(maxdigit);

  }
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  }
