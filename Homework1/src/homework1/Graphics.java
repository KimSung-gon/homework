package homework1;

public class Graphics {
	
	public void draw(Shape s) {
		System.out.print(s + "'s bounds is ");
		System.out.println("width : " + ((Rectangle) s.getBounds()).getWidth() + ", height : " + ((Rectangle) s.getBounds()).getHeight());
		System.out.println("Center is " + s.getCenter().getX() + ", " + s.getCenter().getY());
	}
}
