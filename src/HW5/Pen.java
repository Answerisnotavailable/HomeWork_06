package HW5;

public abstract class Pen {
	private  String brand;
	private  double price;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	public Pen() {
		
	}
	
	public Pen(String brand, double price) {
		this.brand=brand;
		this.price=price;
	}
	
	public abstract void write();
}
