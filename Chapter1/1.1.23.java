import java.util.Arrays;

import Chapter1.Task1_1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class main {
	public static int ij = 0;
	public static int rank(int lo, int hi, int key, int[] a){
		ij++;
		for(int i = 0; i<ij; i++)
			StdOut.print(" ");
		StdOut.printf("%d\t%d\n", lo, hi);
		if(lo>hi)
			return -1;
		int mid = lo + (hi-lo)/2;
		if(a[mid]<key)
			return rank(mid+1,hi,key,a);			
		else if(a[mid]>key)
			return rank(lo, mid-1, key, a);
		else 
			return mid;
	}

	public static int rank(int key, int[] a){
		return rank(0, a.length-1, key, a);
	}
	
	public static void main (String args[]) {
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			int isFound = StdIn.readInt();
			if(isFound<0){
			if(rank(key,whitelist)==-1){
				StdOut.printf("%d\n", key);
			}
			continue;
			}
			if(rank(key,whitelist)!=-1){
				StdOut.printf("%d\n", key);
			}
		}
	}
}

