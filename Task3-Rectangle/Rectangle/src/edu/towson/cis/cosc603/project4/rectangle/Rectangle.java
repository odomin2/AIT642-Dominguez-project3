package edu.towson.cis.cosc603.project4.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		//New get area code.  
		double length = p2.length - p1.length;
		double width = p2.width - p1.width;
		double area = length * width; 		
		return Math.abs(area);
		
		//Commented out the original get area code for reference.   
		//return Math.abs((p2.length - p1.length) * (p2.width - p1.width));
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		//New getDiagonal code.
		double length = Math.pow((p2.length - p1.length), 2);
		double width = Math.pow((p2.width - p1.width), 2);
		return Math.sqrt(length + width);
		
		//Commented out the original get Diagonal for reference.  
		//return Math.sqrt(Math.pow((p2.length - p1.length), 2) + Math.pow((p2.width - p1.width), 2));
	}
}
