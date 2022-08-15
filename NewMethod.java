import java.util.Scanner;
public class NewMethod {
   public static void main(String args[]){
      int length, area;
      Scanner side = new Scanner(System.in);
      System.out.println("Enter the length of the square:");
      length = side.nextInt();
      area = length* length;
      System.out.println("Area of the square is:"+area);
   }
}