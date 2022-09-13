
public class Point extends GeometricFigure {
	
	private double x,y;
	
	
	public Point() {
		
	}

	public Point(double x, double y) {
		this.x = x;
        this.y = y;
		
	}
	

	void setX(double x) {
		this.x = x;
		
	}
	void setY(double y) {
		this.y = y;
		
	}
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}

	
	public void Move(double mx, double my) {
		
		  this.x +=mx;
		  this.y += my;
	  }	
	
	public void Rotate(double rt, double rx, double ry) {
		 double dx = (this.x - rx);
	        double dy = (this.y - ry);
	        double cn = Math.cos(rt);
	        double sn = Math.sin(rt);
	        //  rotate clockwise and roundoff
	        this.x = Math.round((((dx * cn) 
	                        - (dy * sn)) 
	                        + rx));
	        this.y = Math.round(((dx * sn) 
	                        + ((dy * cn) 
	                        + ry)));
		
		
	}
	 public  void Print() {
	     
	        System.out.println(this.x+","+this.y);
	    }
}
