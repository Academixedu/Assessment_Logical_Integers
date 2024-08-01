import java.util.Scanner;

public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a num");
    String num=sc.nextLine();
    int large=0;
    for(int i=0;i<num.length();i++){
      int n=Character.getNumericValue(num.charAt(i));
      if(n>large){
        large=n;
      }

    }
    System.out.println("largest number: "+large);
    
    
  }
  }
