import edu.princeton.cs.algs4.StdOut;

public class main {
	
	public static double lnN(double N){
			if(N==1)
				return Math.log(1);
			return Math.log(N)+lnN(N-1);
	}
	
	public static void main (String args[]) {
			double N  = Double.parseDouble(args[0]);
			StdOut.println(N+" "+lnN(N));
	}
}