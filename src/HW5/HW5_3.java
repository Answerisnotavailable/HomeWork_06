package HW5;

import java.util.Arrays;

public class HW5_3 {

	public int maxElement(int x[][]) {
		int max;
		int [] maxarr=new int[x.length];
		for(int i=0;i<x.length;i++) {
			Arrays.sort(x[i]);
			maxarr[i]=x[i][x[i].length-1];
		}
		max=maxarr[maxarr.length-1];
		return max;
	}
	public double maxElement(double x[][]) {
		double max;
		double [] maxarr=new double[x.length];
		for(int i=0;i<x.length;i++) {
			Arrays.sort(x[i]);
			maxarr[i]=x[i][x[i].length-1];
		}
		max=maxarr[maxarr.length-1];
		return max;
	}
	public static void main(String[] args) {
		int [][]intArray={
							{1, 6, 3},
							{9, 5, 2}};
		double [][]doubleArray={
								{1.2, 3.5, 2.2},
								{7.4, 2.1, 8.2}};
		HW5_3 h=new HW5_3();
		System.out.println(h.maxElement(intArray));
		System.out.println(h.maxElement(doubleArray));
		
	}
}
