package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_2 {
	public double getinput() {
		Scanner s = new Scanner(System.in);
		double a = 0;
		for (int j = 0; j < 1; j++) {
			if (s.hasNextInt()) {
				int i = s.nextInt();
				a = i;
			} else if (s.hasNextDouble()) {
				double d = s.nextDouble();
				a = d;
			} else {
				System.out.println(s.next() + "不是整數，請重新輸入:");
			}
		}
		return a;
	}

	public int[] getmoney() {
		int[] empno = new int[5];
		double in = this.getinput();
		int[][] money = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		for (int i = 0; i < money[1].length; i++) {
			if (money[1][i] >= in) {
				empno[i] = money[0][i];
			}
		}
		return empno;
	}

	public void printempno(int[] empno) {
		Arrays.sort(empno);
		System.out.print("有錢可借的員工編號:");
		int counter = 0;
		for (int i = 0; i < empno.length; i++) {
			if (empno[i] != 0) {
				System.out.print(empno[i] + " ");
				counter++;
			}
		}
		System.out.print("共" + counter + "人!");
	}

	public static void main(String[] args) {
		System.out.println("請問你要借多少錢?");
		HW4_2 h = new HW4_2();
		h.printempno(h.getmoney());
	}

}
