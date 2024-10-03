import java.util.*;

public class Main {
  static int[] memo;
  public static void setLength(int n){
    memo=new int[n];
    Arrays.fill(memo,-1);
  }
  
  
  public static int claimStairs(int n){
    if(n==-1) return 0;
    if(memo[n]!=-1){
      return memo[n];
    }
    else if(n==0){
      memo[n]=1;
      return memo[n];
    }
    else{
      memo[n]=claimStairs(n-1)+claimStairs(n-2);
      return memo[n];
    }
  }
    public static void main(String[] args) {
      int n=new Scanner(System.in).nextInt();
      setLength(n+1);
      System.out.println(claimStairs(n));
  }
}
