/**
 * Shape is an abstract class, from which other classes like Square, Circle, Triangle and Trapezium are inherited
 */

package test;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

abstract class Shape {

	//Attributes
	private Color color;
	
	//Constructors
	protected Shape(){
		Random random = new Random();
		color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
	}
	
	//Methods of a parent class Shape
	public abstract double area();
	
	public abstract void draw(Graphics graph);
	
	public Color getColor(){
		return color;
	}
	
	public String toString() {
		return "This is an abstract class Shape without area and color \n";
	}
}
	
	
	
	
	
	
