import java.util.*;

public class Memoization {
    public static int fib(int n,int[] memo){
      if(memo[n]!=-1){
        return memo[n];
      }
      if(n<=1){
        memo[n]=n;
        return memo[n];
        
      }
      else {
        memo[n]=fib(n-1,memo)+fib(n-2,memo);
        return memo[n];
      }
      
    }
    public static void main(String[] args) {
      int n=7;
      int[] memo=new int[n+1];
      Arrays.fill(memo,-1);
      System.out.println(fib(n,memo));
      System.out.println(Arrays.toString(memo));
  }
}
