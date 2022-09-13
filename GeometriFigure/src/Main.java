
public class Main {

	public static void main(String[] args) {
		
	
		
		Point p =new Point(1,1);
		p.Print();
		p.Rotate(Math.PI, 0, 0);
		p.Print();
		
		
		
		Line l = new Line(0,0,2,2);
		l.Print(); 
		l.Move(2, 2);
		l.Print(); 
		l.Rotate(Math.PI/2, 0, 0);
		l.Print(); 
		
		
		
		
		Circle c = new Circle(1,1,1);
	
		c.Print();
		c.Move(2, 2);
		c.Print();
		c.Rotate(Math.PI, 0, 0);
		c.Print();
		
		
		
		Aggregation agg1 = new Aggregation();
		agg1.AddFigure(new Point(3,2));
		agg1.AddFigure(new Circle(1,1,1));
		agg1.AddFigure(new Line(0,0,2,2));
		
		agg1.Print();
		
		agg1.Move(2, 2);
		agg1.Print();
//		
		agg1.Rotate(Math.PI, 0, 0);
		
		agg1.Print();

	}

}
