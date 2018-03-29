import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class main {
	
	public static void rating(){
			while(!StdIn.isEmpty()){
				String s = StdIn.readString();
				int a = StdIn.readInt();
				int b = StdIn.readInt();
				StdOut.printf("Rating of %s: %d\t%d\t%.3f", s, a, b, (double)a/b);
			}
	}
	
	public static void main (String args[]) {
			rating();
	}
}