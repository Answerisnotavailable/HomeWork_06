package HW7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class HW7_1 {

	public int  getChar(File inputFile) throws Exception {
		FileReader fr= new FileReader(inputFile);
		BufferedReader  br  =   new  BufferedReader(fr) ;
		int i;
		int cha=0;
		while((i=br.read())!=-1) {
			if(i!='\n'&&i!='\r'&&i!='\ufeff') { //
//				System.out.println(i);
				cha++;
			}
		}
		br.close();
        fr.close();
		return cha;
	}
	
	public static void main(String args[]) {
		HW7_1 h=new HW7_1();
		int i;
        int cha=0;
        int line=0;
        File inputFile = new File("C:\\Users\\T14 Gen 3\\Desktop\\java\\7\\Sample.txt");//Sample
        long bytes=inputFile.length();    	
		try {
			cha=h.getChar(inputFile);
			FileReader fr= new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fr) ;
			while(br.readLine()!=null) {
				 line++;
	    	}
	    	System.out.println(inputFile.getName()+"檔案共有"+bytes+"個位元組，"+cha+"個字元，"+line+"列資料");
	    	br.close();
	        fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
