package HW3;

import java.util.Arrays;
import java.util.Scanner;

public class HW3_2 {
	public int getinput() {
		int i = 0;
		Scanner s = new Scanner(System.in);
		if (s.hasNextInt()) {
			i = s.nextInt();
		} else {
			System.out.println("請輸入數字");
		}
		return i;
	}

	public void pick(int x) {
		int count = 0;
		int d = 10 - x;
		int min = x * 10;
		int max = min + 9;
		int[] a = new int[49];
		for (int i = 1; i <= 49; i++) {
			if (!((i + d) % 10 == 0 || (i >= min && i <= max))) {
				count += 1;
				System.out.print(i + "\t");
				a[i - 1] = i;
				if (count % 6 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println(" ");
		System.out.println("總共有" + count + "數字可選");
		HW3_2 p = new HW3_2();
		p.pick6(a, count);
	}

	public void pick6(int[] x, int count) {
		System.out.println("電腦選號:");
		int max = x.length - 1;
		int min = x.length - count;
		for (int i = 1; i <= 6; i++) {
			Arrays.sort(x);
//			System.out.println(Arrays.toString(x));
			// 跳過前面一堆0開始取亂數
			int r = (int) (Math.random() * (max - min + 1)) + min;
			System.out.print(x[r] + "\t");
			x[r] = 0;
			min = min + 1;
		}
	}

	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?");
		HW3_2 h = new HW3_2();
		int x = h.getinput();
		h.pick(x);
	}
}
