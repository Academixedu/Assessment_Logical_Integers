import java.util.Scanner;

public class FindNum{
// Prepare a Logic to find out 2nd  number in a set of number 
  // Let's Take a Number in Scanner
  // Example if you take 235 as number it should return 3
  // Likewise Logic you have written should get 2nd digit of any number
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int temp = a;
    int count=0;

    while(temp!=0){
      temp = temp/10;
      count++;
    }
    temp = a;
    for(int i=1;i<count-1;i++){
      temp = temp/10;
    }
    int second=temp%10;
    System.out.println(second);
  }
}
