package HW2;

public class HW2 {
	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.print(i + " * " + j + " = " + i * j + "\t");
//				j++;
//			}
//			System.out.println();
//		}
//		System.out.println("-------------");
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			do {
//				System.out.print(i + " * " + j + " = " + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//		}
//		System.out.println("-------------");
//		int i = 1;
//
//		while (i <= 9) {
//			int j = 1;
//			do {
//				System.out.print(i + " * " + j + " = " + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//			i++;
//		}
		
		
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int a1=1,sum1=0;
		for (;a1<=1000;a1++) {
			if(a1%2==0) {
				sum1 =a1+sum1;
			}
		}
		System.out.println(sum1);
		
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum2 =1;
		for (int a2=1;a2<=10;a2++) {
			sum2=sum2*a2;
		}
		System.out.println(sum2);
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int i3= 1, sum3=1;
		while(i3<=10) {
			sum3=sum3*i3;
			i3++;
		}
		System.out.println(sum3);
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		int sum4=0;
		for (int i4=1;i4<=20;i4++) {
			if(i4%2!=0) {
				sum4=sum4+i4;
				System.out.print(sum4+" ");
			}
		}
		System.out.println();
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count5 =0;
		System.out.print("阿文可以選擇的數字有:");
		for(int i5=1;i5<=49;i5++) {
			if(!((i5+6)%10==0||i5>=40)) {
				count5+=1;
				System.out.print(i5+" ");
			}
		}
		System.out.println(" ");
		System.out.println("總共有"+count5+"個");
		
			
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		for(int i6=10;i6>=1;i6--) {
			for(int j6 =1;j6<=i6;j6++) {
				System.out.print(j6+" ");
			}
			System.out.println();
		}
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		char c7= 'A';
		for(int i7 =1; i7<=6;i7++) {
			for(int j7=1;j7<=i7;j7++) {
				System.out.print(c7);		
			}
			System.out.println();
			c7++;
		}
	}
}
