package HW10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class HW10_2 {
	public static boolean finished=true;
	public static void choose(String input){
		Double num=Double.parseDouble(input);
		
		System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號:");
		Scanner s = new Scanner(System.in);
//		System.out.print(s.next());
		switch(s.next()) {
			case "1":
				Format dfm1 = new DecimalFormat("#,###");
				System.out.println("千分位數字:"+dfm1.format(num));
				finished=false;
				break;
			case "2":
				Format dfm2 = new DecimalFormat("0%");
				System.out.println("百分比數字:"+dfm2.format(num));
				finished=false;
				break;
			case "3":
				Format dfm3 = new DecimalFormat("0.###E00");
				System.out.println("科學記號數字:"+dfm3.format(num));
				finished=false;
				break;
			default:
				System.out.print("??");
				
		}
	}

	public static void main(String[] args) {
	
	while(finished) {
		System.out.println("請輸入數字:");
		Scanner s = new Scanner(System.in);
		String regex="^\\d{1,}[.]?\\d{0,}$";
		String input=s.next();
	
		if(input.matches(regex)) {
			choose(input);
		}else {
			System.out.println("數字格式不正確，請再輸入一次!");
		}
	}
	
	}
}
