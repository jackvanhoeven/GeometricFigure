
public class Circle extends GeometricFigure {
	
	
	double radius;//radius
	public Point center;
	
public Circle() {
		
		
	}

public Circle(double cx, double cy, double cr) {
    this.center = new Point(cx, cy);
    this.radius = cr;
}

public  void Move(double tx, double ty) {
    this.center.Move(tx, ty);
}

public  void Rotate(double rt, double rx, double ry) {
    this.center.Rotate(rt, rx, ry);
}

public void Print() {
    System.out.printf("circle with center ", this.radius);
    this.center.Print();
}

}
