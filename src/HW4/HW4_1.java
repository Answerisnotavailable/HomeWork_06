package HW4;

public class HW4_1 {
	public static void main(String[] args) {
//	• 有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)
		int[] a1={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum=0;
		for(int i=0;i<a1.length;i++) {
			sum+=a1[i];
		}
		double avg=sum/a1.length;
		System.out.println("平均值:"+avg);
		System.out.println("大於平均值:");
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>avg) {
				System.out.print(a1[i]+"\t");
			}
		}
		System.out.println("");
//	• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
//	(提示：String方法，陣列)
		String s1="Hello World";
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(s1.length()-i-1));
		}
		System.out.println("");
//	• 有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示：字元比對，String方法)
		String[] sa= {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count =0;
		for(int i=0;i<sa.length;i++) {
			String s=sa[i];
			for(int j=0;j<s.length();j++) {
				switch(s.substring(j, j+1)) {
				case "a":
					count++;
					break;
				case "e":
					count++;
					break;
				case "i":
					count++;
					break;
				case "o":
					count++;
					break;
				case "u":
					count++;
					break;				
				}
			}
		}
		System.out.println("共有"+count+"個母音");
				
		
	}
}
