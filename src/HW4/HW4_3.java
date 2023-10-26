package HW4;

import java.util.Scanner;

public class HW4_3 {
	public int[] getinput() {
		System.out.println("請輸入西元年月日:");
		Scanner s = new Scanner(System.in);
		int[] a = new int[3];
		for (int j = 0; j < a.length; j++) {
			if (s.hasNextInt()) {
				int i = s.nextInt();
				a[j] = i;
			} else {
				System.out.println(s.next() + "不是整數，請重新輸入:");
			}
		}
		return a;
	}

	public boolean checkroom(int yy) {
		boolean room = false;
		if (yy > 0 && yy % 4 == 0 && yy % 100 == 0 && yy % 400 == 0) {
			room = true;
		}
		if (yy > 0 && yy % 4 == 0 && yy % 100 != 0) {
			room = true;
		}
		return room;
	}

	public HW4_3() {
		int[] data = this.getinput();
		int yy = data[0];
		int mm = data[1];
		int dd = data[2];
		boolean check = true;
		boolean room = this.checkroom(yy);
		if (yy < 0) {
			System.out.println("年份錯誤，請重新輸入:");
			check = false;
		}
		if (mm < 1 || mm > 12) {
			System.out.println("月份錯誤，請重新輸入:");
			check = false;
		}
		if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
			if (dd > 30) {
				System.out.println("日期錯誤，請重新輸入:");
				check = false;
			}
		}
		if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
			if (dd > 31) {
				System.out.println("日期錯誤，請重新輸入:");
				check = false;
			}
		}
		if (dd < 1) {
			System.out.println("日期錯誤，請重新輸入:");
			check = false;
		}
		if (room) {
			if (mm == 2 && dd > 29) {
				System.out.println("日期錯誤，請重新輸入:");
				check = false;
			}
		} else if (!room) {
			if (mm == 2 && dd > 28) {
				System.out.println("日期錯誤，請重新輸入:");
				check = false;
			}
		}
		if (check) {
			this.daysum(data, room);
		}
	}

	public void daysum(int[] data, boolean room) {
		int[] pinyear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] roomyear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int mm = data[1];
		int dd = data[2];
		int daysum = 0;
		if (mm == 1) {
			daysum = dd;
		} else {
			if (room) {
				for (int i = 0; i < mm - 1; i++) {
					daysum += roomyear[i];
				}
				daysum += dd;
			} else {
				for (int i = 0; i < mm - 1; i++) {
					daysum += pinyear[i];
				}
				daysum += dd;
			}
		}
		System.out.println("輸入的日期為該年第" + daysum + "天");
	}

	public static void main(String[] args) {
		HW4_3 h = new HW4_3();
	}
}
