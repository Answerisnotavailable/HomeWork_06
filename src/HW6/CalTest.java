package HW6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		while(true) {
			try {
				System.out.println("請輸入x的值:");
				Scanner s = new Scanner(System.in);
				int x,y;
				x=s.nextInt();
				System.out.println("請輸入y的值:");
				Scanner s2 = new Scanner(System.in);
				y=s2.nextInt();
				Calculator cal=new Calculator();
				System.out.println(x+"的"+y+"次方等於"+cal.powerXY(x,y));
			} catch (CalException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("輸入格式不正確");
			}
			
		}
		
	}
}
