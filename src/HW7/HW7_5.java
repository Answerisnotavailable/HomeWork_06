package HW7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class HW7_5 {

//	承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//			型簡化本題的程式設計)
	public static void main(String arg[]) {
		File f=new File("C:\\data\\Object.ser");
		try {
			FileInputStream fis= new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				while(true) {
					((Speakable)ois.readObject()).speak();
				}
			}catch(EOFException e) {
			ois.close();
			fis.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
