package HW9;

class Bank{
	private int money=0;
	synchronized public void in(int moneyin, int i) {
		if(Bear.finished==false) {
			while(money>3000) {
				System.out.println("媽媽看到餘額在3000以上，暫停匯款");
				try {
					System.out.println("熊大被老媽告知帳戶已經有錢!");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			money+=moneyin;
			System.out.println("媽媽存了"+moneyin+"，帳戶共有:"+money);
			notify();
		}else {
			money+=moneyin;
			System.out.println("媽媽存了"+moneyin+"，帳戶共有:"+money);
			
		}
	}
	synchronized public void out(int moneyout, int i) {
		while(money<moneyout) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				System.out.println("媽媽被熊大要求匯款!");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money-=moneyout;
		System.out.println("熊大領了"+moneyout+"，帳戶共有:"+money);
		if(money<2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
		if(i==10) {
			try {
				Bear.finished=true;
				notify();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Bear extends Thread{
	Bank bank;
	public static boolean finished=false;
	public Bear(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			bank.out(1000,i);
		}
	}
}



class Mom extends Thread{
	Bank bank;
	public Mom(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			bank.in(2000,i);
		}
	}
	
}

public class HW9_2 {
	public static void main(String[] args) {
		Bank bank=new Bank();
		Mom mom=new Mom(bank);
		Bear bear=new Bear(bank);
		mom.start();
		bear.start();
		try {
			mom.join();
			bear.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
