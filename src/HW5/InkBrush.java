package HW5;

public class InkBrush extends Pen{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("沾墨汁再寫");
	}
	
	public double getPrice() {
		double p=super.getPrice();
		return p*0.9;
	}
	
	public InkBrush() {
		
	}
	public InkBrush(String brand, double price) {
		super(brand,price);
	}


	
}
