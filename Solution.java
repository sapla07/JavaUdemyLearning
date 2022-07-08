
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Wall wall = new Wall(5,4);		
//			
//			System.out.println(wall.getArea());
//			
//			wall.setHeight(-1.5);
//			System.out.println(wall.getWidth());
//			System.out.println(wall.getHeight());
//			System.out.println(wall.getArea());
			
//			Point first = new Point(6,5);
//			Point second = new Point(3,1);
//			System.out.println(first.distance());
//			System.out.println(first.distance(second));
//			System.out.println(first.distance(2,2));
//			
//			Point point = new Point();
//			System.out.println(point.distance());
		
//			Floor floor = new Floor(2.75, 4.0);
//			Carpet carpet = new Carpet(3.5);
//			
//			Calculator cal = new Calculator(floor, carpet);
//			System.out.println(cal.getTotalCost());
		
		
		Circle circle = new Circle(3.75);
		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());
		
		Cylinder cy = new Cylinder(5.55, 7.25);
		
		System.out.println(cy.getRadius());
		System.out.println(cy.getHeight());
		System.out.println(cy.getArea());
		System.out.println(cy.getVolume());
			
	}

}
