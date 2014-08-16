import java.util.Scanner;
public class MaxMinPrinter
{
  public static void main(String[] args)
  {
  Scanner in = new Scanner(System.in);
  int max = Integer.MIN_VALUE;
  int min = Integer.MAX_VALUE;

     System.out.print("Enter an integer: ");
     while (in.hasNextInt())
     {
        int number = in.nextInt();
        max = Math.max(max, number);
        min = Math.min(min, number);
        System.out.print("Enter an integer: ");
     }
    System.out.println(max);
    System.out.println(min);
  }
}