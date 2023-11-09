package HW5;

public class HW5_4 {
	public static  void genAuthCode(){
		//65-90 97-122
		for(int i=0;i<=7;i++) {
			int rand=(int)((Math.random()*3)+1);
			switch(rand){
				case 1:
					System.out.print((int)(Math.random()*10));
					break;
				case 2:
					System.out.print((char)((Math.random()*26)+65));
					break;
				case 3:
					System.out.print((char)((Math.random()*26)+97));
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為:");
		genAuthCode();
	}

}
