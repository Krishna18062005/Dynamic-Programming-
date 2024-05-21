import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Matrix same Characters
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N<=1){ System.out.print("YES");
		return;}
		boolean rslt=true;
		char fir=97;
		char[][] matri=new char[N][N];
		char sec=97;
		for(int i=0;i<N;i++){
		for(int j=0;j<N;j++){
		    char curr=sc.next().charAt(0);
		    matri[i][j]=curr;
		    
		    if(i==0&&j==0) fir=curr;
		    if(i==0&&j==1) sec=curr;
		    else if(fir!=curr&&(i==j)) rslt=false;
		    else if(fir!=curr&&(N==i+j+1)) rslt=false;
		    
		}}
		System.out.print((checkNonDiag(matri)&&rslt)?"YES":"NO");
	}
	public static boolean checkNonDiag(char[][] matri){
	    char a=matri[0][1];
	    for(int i=0;i<N;i++){
	        for(int j=0;j<N;j++){
	            if(i!=j&&i!=j-N+1&&a!=matri[i][j]){
	                return false;
	            }
	        }
	    }
	    return true;
	}
}
