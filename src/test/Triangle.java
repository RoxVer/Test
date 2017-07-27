package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Triangle extends Shape {
	
	private Random random = new Random();
	private double sideA;
	private double sideB;
	private double sideC;
    private double height;
    
    //Constructors
    public Triangle(Random random, double sideA, double sideB, double sideC){
    	super();
    	this.sideA = sideA;
    	this.sideB = sideB;
    	this.sideC = sideC;
    }
    
    protected Triangle(){
		super();
		do{
		sideA = random.nextDouble() * 100;
		sideB = random.nextDouble() * 100;
		sideC = random.nextDouble() * 100;
		} while ((sideA + sideB) > sideC);
	}
    
    //Unique methods of a Triangle class, which returns height
    public double height(){
    	return height = 2 * (sideA/sideB);
    }
    
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (height() * sideB)/2;
	}
	
	@Override
	public void draw(Graphics graph) {
		int[] x = {300, (int)(300 + sideA), (int)(300 + sideB)};
		int[] y = {100, (int)(100 + sideA), (int)(100 + sideB)};
		graph.drawPolygon(x, y, 3);
	}
	
	@Override
	public String toString() {
		return "Shape: triangle, " + "area: " + area() + " sq. un., height: " + height() + " un., color: " + getColor() + "\n";
	}
}
