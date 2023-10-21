package HW3;

import java.util.Scanner;

public class HW3_1 {
	public int getinput() {
		int i=0;
		Scanner s = new Scanner(System.in);
		if (s.hasNextInt()) {
			i = s.nextInt();
		}
		else {
			System.out.println("請輸入數字");
		}
		return i;
	}
	
	public int getrandom() {
		int i;
		i=(int)(Math.random()*101);
		return i;
	}
	
	public void guess(int target) {
		HW3_1 h = new HW3_1();
		int input = h.getinput();
		while(input!=target) {
			if(input<target) {
				System.out.println("小於正確答案");
				input = h.getinput();
			}
			else if(input>target){
				System.out.println("大於正確答案");
				input = h.getinput();
			}
		}
		System.out.println("答對了!答案就是"+target);
	}
	
	public static void main(String[] args) {
		System.out.println("開始猜數字吧!");
		HW3_1 h = new HW3_1();
		int target = h.getrandom();
//		System.out.println("target:"+target);
		h.guess(target);
	}
}
