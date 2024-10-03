// import java.util.*;

// public class Memoization {
//     public static int fib(int n,int[] memo){
//       if(memo[n]!=-1){
//         return memo[n];
//       }
//       if(n<=1){
//         memo[n]=n;
//         return memo[n];
        
//       }
//       else {
//         memo[n]=fib(n-1,memo)+fib(n-2,memo);
//         return memo[n];
//       }
      
//     }
//     public static void main(String[] args) {
//       int n=7;
//       int[] memo=new int[n+1];
//       Arrays.fill(memo,-1);
//       System.out.println(fib(n,memo));
//       System.out.println(Arrays.toString(memo));
//   }
// }


import java.util.*;

public class Main {
  static int[] memo;
  public static void setLength(int n){
    memo=new int[n];
    Arrays.fill(memo,-1);
  }
  
  static int s=0;
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
   public static int claimStair(int n){
    if(n==0){
      return 1;
    }
    else if (n==-1){
      return 0;
    } 
    else{
      return claimStairs(n-1)+claimStairs(n-2);
    }
  }

    public static void main(String[] args) {
      int n=new Scanner(System.in).nextInt();
      setLength(n+1);
      long st=(System.nanoTime());
      System.out.println("Using Memoization "+claimStairs(n));
     // System.out.println(Arrays.toString(memo));
      long et=(System.nanoTime());
      System.out.println("RunTime : "+(et-st));
      System.out.println();
      
      long str=(System.nanoTime());
      System.out.println("Recursive Approach "+claimStair(n));
      
      long etr=(System.nanoTime());
      System.out.println("RunTime : "+(etr-str));
  }
}
