import java.util.*;

public class Eligiblefor_vote {
  public static void VoteMachine(int age){
    if(age>18){
      System.out.print("eligilble");
      
    } else{
      System.out.println("not eligible");
    }
    return;
     
  }
  public static void main (String []args ) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your age:");
    int age = sc.nextInt();
    VoteMachine(age);

  }
  
}
