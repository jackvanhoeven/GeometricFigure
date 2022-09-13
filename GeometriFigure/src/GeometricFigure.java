
public abstract class GeometricFigure {
	
	private double x,y;//x and y coordinates
	
	
	public GeometricFigure() {
		
		
	}
	


	public abstract void Move(double tx, double ty);
    
    // translation
    public abstract void Rotate(double rt, double rx, double ry);
    
    // rotation about a point (x,y)
    public abstract void Print();
	



}



