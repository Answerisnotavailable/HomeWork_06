package HW3;

import java.util.Scanner;
public class HW3 {
//	public void getinput(Scanner a) {
//		if (a.hasNextInt()) {
//			int i=a.nextInt();
//		}
//		else if(a.hasNextDouble()) {
//			double d=a.nextDouble();
//		}
//		else {
//			System.out.println("不是三角形");
//		}
//	}
	
	public static void main(String[] args) {
		System.out.println("請輸入三個整數:");
		Scanner s =new Scanner(System.in);
		while(s.hasNext()){
			if(s.hasNextInt()) {
				System.out.println(s.next());
			}
			
		    System.out.println("not int");
		    System.out.println("===");
		}
		s.close();
//		int i;
//		double d;
//		System.out.println("請輸入三個整數:");
//		Scanner sc =new Scanner(System.in);
//		System.out.println();
//		HW3 a =new HW3() ;
//
//		if (sc.hasNextInt()) {
//			i=sc.nextInt();
//			System.out.println(i);
//		}
//		else if(sc.hasNextDouble()) {
//			d=sc.nextDouble();
//			System.out.println(d);
//		}
//		else {
//			System.out.println("請重新輸入");
//		}
	}
}
