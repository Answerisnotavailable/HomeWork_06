package HW10;

public class HW10_1 {
	public static boolean prime(int a) {
		if(a==1) {
			return false;
		}else {
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String arg[]) {
		for(int i=1;i<=5;i++) {
			int ran=(int)(Math.random()*100)+1;
			if(prime(ran)) {
				System.out.println(ran+"是質數");
			}else {
				System.out.println(ran+"不是質數");
			}
		}
	}
}
