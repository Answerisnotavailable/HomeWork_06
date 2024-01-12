package HW9;



public class HW9_1 implements Runnable{
	private String name;
	int counter = 1;
	
	public HW9_1(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (counter <= 10) {
			try {
				Thread.sleep((long)(Math.random()*2501)+500);
				System.out.println(this.name+"吃第"+counter+"碗飯");
				counter++;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name+"吃完了!");
		
		
	}
	public static void main(String arg[]) {
		HW9_1 r1 = new HW9_1("饅頭人");// 產生Runnable物件
		Thread t1 = new Thread(r1); // 再由Runnable物件, 產生執行緒Thread物件
		HW9_1 r2 = new HW9_1("詹姆士");
		Thread t2 = new Thread(r2);
		System.out.println("-----大胃王快食比賽開始!-----");
		try {
			t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("-----大胃王快食比賽結束!-----");
		}
		
	}

}
