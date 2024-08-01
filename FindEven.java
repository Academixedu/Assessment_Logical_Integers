import java.util.Scanner;
public class FindEven{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number:");
    String strnum=sc.nextLine();
    for(int i=0;i<strnum.length();i++){
       char digit = strnum.charAt(i);
        if(digit%2==0){
            System.out.print(digit+" ");
        }
    }
  }
}
