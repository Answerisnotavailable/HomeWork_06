package HW8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HW8_2 {

	public static void setTrain(Train[] at) {
		System.out.println("-----不重複");
		Set<Train> set=new HashSet<Train>();
		for(int i=0;i<at.length;i++) {
			set.add(at[i]);
		}
		System.out.println("-----for-each");
		for(Train t:set) {
			System.out.println(t.getNumber());
		}
		System.out.println("-----Iterator");
		Iterator objs=set.iterator();
		while(objs.hasNext()) {
			System.out.println(((Train)objs.next()).getNumber());
		}
	}
	
	public static void arrayListTrain(Train[] at) {
		System.out.println("-----大到小");
		List<Train> list=new ArrayList<Train>();
		for(int i=0;i<at.length;i++) {
			list.add(at[i]);
		}
		Collections.sort(list);
		System.out.println("-----for");
		for(Train t:list) {
			System.out.println(t.getNumber());
		}
		System.out.println("-----for-each");
		for(Train t:list) {
			System.out.println(t.getNumber());
		}
		System.out.println("-----Iterator");
		Iterator objs=list.iterator();
		while(objs.hasNext()) {
			System.out.println(((Train)objs.next()).getNumber());
		}
	}
	
	public static void treesetTrain(Train[] at) {
		System.out.println("-----大到小+不重複");
		Set<Train> treeset = new TreeSet<Train>();
		for(int i=0;i<at.length;i++) {
			treeset.add(at[i]);
		}
		System.out.println("-----for-each");
		for(Train t:treeset) {
			System.out.println(t.getNumber());
		}
		
		System.out.println("-----Iterator");
		Iterator objs=treeset.iterator();
		while(objs.hasNext()) {
			System.out.println(((Train)objs.next()).getNumber());
		}
	}
	
//	設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//	需使用的集合裡
//	- (202, "普悠瑪", "樹林", "花蓮", 400)
//	- (1254, "區間", "屏東", "基隆", 700)
//	- (118, "自強", "高雄", "台北", 500)
//	- (1288, "區間", "新竹", "基隆", 400)
//	- (122, "自強", "台中", "花蓮", 600)
//	- (1222, "區間", "樹林", 七堵, 300)
//	- (1254, "區間", "屏東", "基隆", 700)
	public static void main(String[] args) {
		Train[] at=new  Train[7];
		at[0]=new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		at[1]=new Train(1254, "區間", "屏東", "基隆", 700);
		at[2]=new Train(118, "自強", "高雄", "台北", 500);
		at[3]=new Train(1288, "區間", "新竹", "基隆", 400);
		at[4]=new Train(122, "自強", "台中", "花蓮", 600);
		at[5]=new Train(1222, "區間", "樹林", "七堵", 300);
		at[6]=new Train(1254, "區間", "屏東", "基隆", 700);
		setTrain(at);
		arrayListTrain(at);
		treesetTrain(at);
	}
}
