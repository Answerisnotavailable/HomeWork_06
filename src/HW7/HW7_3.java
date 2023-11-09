package HW7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class HW7_3 {

//	請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案
	public static void copyFile(String src , String target) throws Exception {
		String str;
		FileReader fr =new FileReader(src);
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter(target);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		while((str=br.readLine())!=null) {
			pw.println(str);
			pw.flush();
		}
		pw.close();
		bw.close();
		fw.close();
		br.close();
		fr.close();
	}
	
	public static void main(String args[]) {
		String src="C:\\Users\\T14 Gen 3\\Desktop\\java\\7\\Sample.txt";
		String target="C:\\Users\\T14 Gen 3\\Desktop\\java\\7\\target.txt";
		try {
			copyFile(src,target);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

