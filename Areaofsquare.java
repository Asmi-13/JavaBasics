import java.util.Scanner;
public class Areaofsquare {
   public static void main(String args[]){
      int length, area;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the length of the square ::");
      length = sc.nextInt();
      area = length* length;
      System.out.print("Area of the square is ::"+area);
   }
}