package function;
import java.util.*;


public class Averageof3no {
  public static int Average(int a, int b, int c){ // for average in integer or decimal  use.... double instead of int 
    return (a+b+c)/3; // note use 3.0 for average in decimal
  }
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc .nextInt();
    System.out.println("A_verage of three no is : "+ Average(a,b,c));

  }
  
}
