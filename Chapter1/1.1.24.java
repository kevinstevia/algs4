import java.util.Arrays;

import Chapter1.Task1_1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class main {
	
	public static int Euclid(int p, int q){
		if (q==0)
			return p;
		StdOut.printf("%d\t%d\n", p, q);
		int r = p%q;
		return Euclid(q, r);
	}
	
	public static void main (String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		StdOut.println(Euclid(a, b));
	}
}

