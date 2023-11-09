package HW7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HW7_2 {
//	請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//			append功能讓每次執行結果都能被保存起來)

	public  static int[] rand1000(int count) {
		int [] rand=new int[count];
		for (int i=0;i<rand.length;i++) {
			rand[i]=(int)(Math.random()*1000)+1;
		}
		return rand;
		}
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\T14 Gen 3\\Desktop\\java\\7\\Data.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			int [] num=rand1000(10);
			for(int i=0;i<num.length;i++) {
				pw.println(num[i]);
			}
			pw.close();
			bw.close();
			fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
	}

}
