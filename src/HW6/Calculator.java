package HW6;


public class Calculator {
	private int x;
	private int y;
	
	public int powerXY(int x, int y) throws CalException{
		if(x==0&&y==0) {
			throw new CalException("0的0次方沒有意義!");
		}
		else if(y<0){
			throw new CalException("次方為負值，結果回傳不為整數!");
		}
		else {
			int a=(int)Math.pow(x, y);
			return a;
		}
		
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y)throws CalException{
		if(y<0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}
		else {
			this.y=y;
		}
		
	}


}
