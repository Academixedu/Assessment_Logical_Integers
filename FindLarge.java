import java.util.Scanner;

public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the value");
    int a=in.nextInt();
    int temp=0;
   while(a!=0){
    int b=a%10;
    if(b>temp){
      temp=b;
    }
    a=a/10;
   
  }
  System.out.println("large number: "+temp);  
  }
  }
