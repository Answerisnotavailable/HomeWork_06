package HW8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



public class Train implements Comparable<Train>{

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number;
	}

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public int getNumber() {
		return this.number;
	}
	public String getType() {
		return this.type;		
	}
	public String getStart() {
		return this.start;		
	}
	public String getDest() {
		return this.dest;		
	}
	public double getPrice() {
		return this.price;
	}
	public void setNmber(int number) {
		this.number=number;
	}
	public void setType(String type) {
		this.type=type;
	}
	public void setStart(String start) {
		this.start=start;
	}
	public void setDest(String dest) {
		this.dest=dest;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public Train() {
		
	}
	public Train(int number, String type, String start, String dest, double price){
		this.number=number;
		this.type=type;
		this.start=start;
		this.dest=dest;
		this.price=price;
	}
	public int compareTo(Train aTrain) {
		if (this.number > aTrain.number) {
			return -1;
		} else if(this.number == aTrain.number){
			return 0;
		}else {
			return 1;
		}
	}

	public static void main(String args[]) {

	}
}
