package HW7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class HW7_4 {

//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String arg[]) throws Exception {

		File fDir=new File("C:\\data");
		if(!fDir.exists()) {
			fDir.mkdir();
		}
		File f=new File("C:\\data\\Object.ser");
		Speakable[] sp=new Speakable[4];
		sp[0]=new Dog("D1");
		sp[1]=new Dog("D2");
		sp[2]=new Cat("C1");
		sp[3]=new Cat("C2");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < sp.length; i++)
			oos.writeObject(sp[i]);
		oos.close();
		fos.close();
	}
	
}
