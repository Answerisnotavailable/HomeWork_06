package HW10;

import java.util.Scanner;

public class HW10_3 {
	public static boolean finished=true;
	
	public static void choose(String input){
		System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
		
	}
	
	public static void main(String[] args) {
			
		while(finished) {
			System.out.println("請輸入日期(年月日，例如20110131):");
			Scanner s = new Scanner(System.in);
//			String regex="^\\d{4}[01]{1}\\d{1}[0123]{1}\\d{1}$";
			String regex1="^\\d{4}[0]{1}[1-9]{1}[0123]{1}\\d{1}$";
			String regex2="^\\d{4}[1]{1}[0-2]{1}[0123]{1}\\d{1}$";
			String input=s.next();
		
			if(input.matches(regex1)) {
//				choose(input);
				System.out.println("1-9月");

				String year=input.substring(0, 4);
				int intyear=Integer.parseInt(year);
//				if(arrinput[4]>0&&arrinput[5]>2) {
//					
//				}
			}else if(input.matches(regex2)){
				System.out.println("10-12月");
			}else {
				System.out.println("日期格式不正確，請再輸入一次!");
			}

		}
	
	}

}
