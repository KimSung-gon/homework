package homework1;

public abstract class Shape extends Point{
	
	protected Point center;
	
	public Shape(){}
	
	public Shape(Point center){
		this.center = center;
	}
	
	public abstract Point getCenter();
	public abstract Shape getBounds();
	public void draw(Graphics g) {
		return;
	}
}
