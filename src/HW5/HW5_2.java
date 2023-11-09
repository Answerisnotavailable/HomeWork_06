package HW5;

public class HW5_2 {

	public static void randAvg(){
		System.out.println("本次亂數結果:");
		int rand[]=new int[10];
		for(int i=0;i<rand.length;i++) {
			rand[i]=(int)(Math.random()*101);
			System.out.print(rand[i]+" ");
		}
		System.out.println();
		System.out.println("平均值:");
		int total=0;
		for(int i=0;i<rand.length;i++) {
			total+=rand[i];
		}
		System.out.println(total/rand.length);

		
	}
	
	public static void main(String[] args) {
		randAvg();
	}
	
}
