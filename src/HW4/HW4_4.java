package HW4;

import java.util.Arrays;

public class HW4_4 {
	public int [] findmax(int [][]score) {
		int[] max=new int[score.length];
		for(int i=0;i<score.length;i++) {
			int []copy=Arrays.copyOf(score[i], score[i].length);
			Arrays.sort(copy);
			max[i]=copy[7];
		}
		return max;
	}
	
	public int []  maxcount(int [][]score,int [] max) {
		int[] maxcount=new int[score[0].length];
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<maxcount.length;j++) {
				if(max[i]==score[i][j]) {
					maxcount[j]++;					
				}
			}
		}
		return maxcount;
	}
	
	public void print(int [] maxcount) {
		for(int i=0;i<maxcount.length;i++) {
			int no=i+1;
			System.out.print(no+"號:"+maxcount[i]+"次\t");
		}
	}
	
	public HW4_4(int[][] score) {		
		this.print(this.maxcount(score, this.findmax(score)));
	}
	
	public static void main(String[] args) {
		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 },
						  { 37, 75, 77, 89, 64, 75, 70, 95 },
						  { 100, 70, 79, 90, 75, 70, 79, 90 },
						  { 77, 95, 70, 89, 60, 75, 85, 89 },
						  { 98, 70, 89, 90, 75, 90, 89, 90 },
						  { 90, 80, 100, 75, 50, 20, 99, 75 }};
		HW4_4 h = new HW4_4(score);
	}
}
