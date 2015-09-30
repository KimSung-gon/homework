package homework1;

public class Rectangle extends Shape{
	
	int h;
	int w;
	
	public Rectangle(Point center, int w, int h){
		this.center = center;
		this.h = h;
		this.w = w;
	}

	public Rectangle getBounds() {
		return this;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}

	@Override
	public Point getCenter() {
		return this.center;
	}
	
	public int getHeight(){
		return h;
	}
	
	public int getWidth(){
		return w;
	}

}
