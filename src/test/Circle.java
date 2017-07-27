package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Circle extends Shape {
	//Unique attributes of a child class Circle
	private Random random = new Random();
    private double radius;
    
    //Constructors
    public Circle(Random random, double radius){
    	super();
    	this.radius = radius;
    }
    
    protected Circle(){
		super();
		radius = random.nextDouble() * 100; 
	}
    
    //Unique methods of a Circle class, which returns diameter
    public double diameter(){
    	return radius * 2;
    }
    
    //Overridden methods of a parent class Shape
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	
	@Override
	public void draw(Graphics graph) {
		graph.drawOval(40, 40, (int)(radius * 2), (int)(radius * 2));
	}
	@Override
	public String toString() {
		return "Shape: circle, " + "area: " + area() + " sq. un., diameter: " + diameter() + " un., color: " + getColor() + "\n";
	}
}
