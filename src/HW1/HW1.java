package HW1;

public class HW1 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12;
		int b = 6;
		System.out.println(a + b);
		System.out.println(a * b);
//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int da = 12;
		System.out.println(egg / da + "打" + egg % da + "顆");
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec = 256559;
		int M = sec / 60;
		int M_mod = sec % 60;
		int H = M / 60;
		int H_mod = M % 60;
		int D = H / 24;
		int D_mod = H % 24;
		System.out.println(D + "天" + D_mod + "小時" + H_mod + "分" + M_mod + "秒");
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		double area = PI * Math.pow(r, 2);
		double perimeter = 2 * PI * r;
		System.out.println("圓面積:" + area + ", 圓周長:" + perimeter);
//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		int PV = 1_500_000;
		double R = 0.02;
		int n = 10;
		double FV = PV * Math.pow(1 + R, n);
		System.out.println("十年後本金加利息共有:" + FV + "元");
//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
		System.out.println(5 + 5);
		// 先將數字做算術運算後再print出來
		System.out.println(5 + '5');
		// '5'為char，所以對應的Unicode Table代碼為35，16進制的35換算為10進制即為53，再與數字5相加，可得到答案為58
		System.out.println(5 + "5");
		// "5"為字串，以+號將字串5與數字5串街後顯示為55

//		並請用註解各別說明答案的產生原因
	}

}
