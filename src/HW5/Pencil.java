package HW5;

public class Pencil extends Pen{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("削鉛筆再寫");
	}
	
	public double getPrice() {
		double p=super.getPrice();
		return p*0.8;
	}
	
	public Pencil() {
		
	}
	public Pencil(String brand, double price) {
		super(brand,price);
	}

}
