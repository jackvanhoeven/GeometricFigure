
public class Line extends GeometricFigure{
	
	
	 public Point ms;
	    
	   public Point me;
	public Line() {
			
			
	}
	

	public Line(double sx, double sy, double ex, double ey) {
        this.ms = new Point(sx, sy);
        this.me = new Point(ex, ey);
    }
	

	
	public void Move(double tx, double ty) {
		 // move both points together, so the line moves
        this.ms.Move(tx, ty);
        this.me.Move(tx, ty);
		
		
	}
	
	
	
	 public void Rotate(double rt, double rx, double ry) {
	        // rotate the line about it
	        this.ms.Rotate(rt, rx, ry);
	        this.me.Rotate(rt, rx, ry);
	    }
	 public  void Print() {
	        System.out.println("line with points:");
	        System.out.println("starting ");
	      
	        this.ms.Print();
	        System.out.println("ending ");
	        this.me.Print();
	    }
	 

}
