import java.util.Scanner;
public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter number : ");
    String a= s.nextLine();
    int large=0;
    for(int i=0;i<a.length();i++){
      int num=Character.getNumericValue(a.charAt(i));
      if(num>large){
        large=num;
      }
    }
System.out.println("largest digit is : "+large);
  }
  }
