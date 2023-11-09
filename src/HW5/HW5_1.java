package HW5;

import java.util.Scanner;

public class HW5_1 {

	public int[] getinput() {
		Scanner s = new Scanner(System.in);
		int[] a = new int[2];
		for (int j = 0; j < a.length; j++) {
			if (s.hasNextInt()) {
				a[j] = s.nextInt();
			} else {
				System.out.println(s.next() + "不是整數，請重新輸入!");
			}
		}
		return a;
	}

	public void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public HW5_1() {
		int[] input = this.getinput();
		starSquare(input[0], input[1]);
	}

	public static void main(String[] args) {
		System.out.println("請輸入寬與高:");
		HW5_1 h = new HW5_1();
	}

}
