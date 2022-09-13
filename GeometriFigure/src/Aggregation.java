import java.util.ArrayList;

public class Aggregation extends GeometricFigure {
	
	ArrayList<GeometricFigure> agg = new ArrayList<GeometricFigure>(); // Create an ArrayList object
	
	public Aggregation() {
        this.agg = new ArrayList<GeometricFigure>();
    }
	
	 public final void AddFigure(GeometricFigure figure) {
	        this.agg.add(figure);
	    }
	 
	 public  void Move(double tx, double ty) {
	        //  translate every shape the same way
	        for (GeometricFigure gf : this.agg) {
	        	gf.Move(tx, ty);
	        }
	        
	    }
	 
	  public void Rotate(double rt, double rx, double ry) {
	        //  rotate every shape the same way
	        for (GeometricFigure gf : this.agg) {
	        	gf.Rotate(rt, rx, ry);
	        }
	        
	    }
	  
	  public void Print() {
	        //  print shape information
	        for (GeometricFigure gf : this.agg) {
	        	gf.Print();
	        }
	        
	    }

}
