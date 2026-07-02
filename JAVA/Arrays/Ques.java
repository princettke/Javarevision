import java.util.*;
public class Ques
 {
  public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your array size:");
    int size = sc.nextInt();
    System.out.println("enter your array elements:");
    int [] marks = new int [size];
    for (int i=0;i<size;i++){
      marks[i]=sc.nextInt();
     

    }
    for(int i =0; i<size;i++){
      System.out.println("This is your arrays "+marks[i]);
    }
    System.out.println("enter the element thats you want to known index:");
    int n = sc.nextInt();

    for(int i=0;i<size;i++){
      if(marks[i]==n){
        System.out.println("this is your index of element "+i);
      }
      
    

  }

}
