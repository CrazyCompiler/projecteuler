//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.
import java.lang.*;

class Problem1 {
  public static void main(String[] args) {
    double total = 0;
    int maxNumber = Integer.parseInt(args[0]);
    double maxDivisibleOf5 =  Math.ceil(maxNumber/5);
    double maxDivisibleOf3 = Math.ceil(maxNumber/3);
      for(int index=1;index<=maxDivisibleOf3;index++){
          total += index*3;
      };
      for(int i=1;i<maxDivisibleOf5;i++){
        if((i*5)%3!=0)
          total += i*5;
      }
    System.out.println(total);
  }
}
