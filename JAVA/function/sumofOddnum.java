import java.util.*; 

public class sumofOddnum {
  public static int Sumodd(int n){
    int sum =0;
    for( int i=1;i<=n;i++){
      if(i % 2 !=0){  // use for not equal (!=) for equal  (==)
        sum = sum +i;
      }
    

    }
    return sum ;
  }
  public static void main (String [] args) {
    Scanner  sc = new Scanner (System.in);
    int n =  sc.nextInt();
    System.out.print("Sum of odd numbers is : "+ Sumodd(n));
  
  
  }
}
