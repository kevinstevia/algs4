import java.util.Arrays;

import Chapter1.Task1_1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdDraw;;

public class main {
	
	public static void randCon(int N, double p){
		double xC = 0.5;
		double yC = xC;
		double penRad = 0.05;
		double rad = xC-penRad;
		double degL = 2*Math.PI/((double)N);
		double[][] a = new double[N][2];
		double x, y;
		StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledCircle(xC, yC, rad);
        StdDraw.setPenColor(StdDraw.MAGENTA);
		for(int i = 0; i<N; i++){
			x = Math.cos(degL*i)*rad+xC;
			y = Math.sin(degL*i)*rad+yC;
			StdDraw.point(x, y);
			a[i][0] = x;
			a[i][1] = y;
		}
		for(int i = 0; i<N-1; i++){
		for(int j = i+1; j<N; j++)
			if(Math.random()<=p){
				StdDraw.line(a[i][0], a[i][1], a[j][0], a[j][1]);
			}
		}
	}
	
	public static void main (String args[]) {
		int N = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);
		randCon(N, p);
	}
}

