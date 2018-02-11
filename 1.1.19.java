import Chapter1.Task1_1;
import edu.princeton.cs.algs4.StdOut;

public class main {
	private static int[] a;
	
	public static int F(int N){
			if(N==1 || N==0)
				return 1;
			a[N] = a[N-1]+a[N-2];
			return a[N];
	}
	
	public static void main (String args[]) {
		long startTime, endTime, executionTime;
		a = new int[100];
		a[0] = 1;
		a[1] = 1;
		for(int N = 0; N<41; N++){
			startTime = System.currentTimeMillis();
			StdOut.println(N+" "+F(N));
			endTime = System.currentTimeMillis();
			executionTime = endTime-startTime;
			StdOut.println(executionTime);
		}
	}
}
