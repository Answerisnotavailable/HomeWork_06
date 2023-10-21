package HW3;

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
	public double[] getinput() {
		Scanner s = new Scanner(System.in);
		double[] a = new double[3];
		for (int j = 0; j < a.length; j++) {
			if (s.hasNextInt()) {
				int i = s.nextInt();
				a[j] = i;
			} else if (s.hasNextDouble()) {
				double d = s.nextDouble();
				a[j] = d;
			} else {
				System.out.println(s.next() + "不是整數，請重新輸入:");
			}

		}
		return a;
	}

	public void get3(double[] a) {
		Arrays.sort(a);
		if (a[0] + a[1] > a[2]) {
			if (a[0] == a[1] && a[0] == a[2]) {
				System.out.println("正三角形");
			} else if (a[0] == a[1] || a[0] == a[2] || a[1] == a[2]) {
				System.out.println("等腰三角形");
			} else if (Math.sqrt(Math.pow(a[0], 2) + Math.pow(a[1], 2)) == a[2]) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}

	public static void main(String[] args) {
		System.out.println("請輸入三個整數:");
		HW3 h = new HW3();
		double[] x = h.getinput();
		h.get3(x);
	}
}
