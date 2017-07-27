package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Trapezium extends Shape {
	
	private Random random = new Random();
	private double sideA;
	private double sideB;
	private double sideC;
	private double sideD;
    
    
    public Trapezium(Random random, double sideA, double sideB, double sideC, double sideD){
    	super();
    	this.sideA = sideA;
    	this.sideB = sideB;
    	this.sideB = sideC;
    	this.sideB = sideD;
    }
    
    protected Trapezium(){
		super();
		sideA = random.nextDouble() * 100;
		sideB = random.nextDouble() * 100;
		sideC = random.nextDouble() * 100;
		sideD = random.nextDouble() * 100;
	}
    
    //Method of Trapezium, which returns side length
    public double side(){
    	return sideA;
    }
  //Method of Trapezium, which returns height
    public double height(){
		return Math.sqrt((Math.pow(sideC, 2)) - (Math.pow((sideA - sideB), 2)));
    }
    
    
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (sideA * sideB)/height();
	}
	
	@Override
	public void draw(Graphics graph) {
		int[] x = {450, (int)(450 + sideA), (int)(450 + sideB), (int)(450 + sideC)};
		int[] y = {200, (int)(200 + sideA), (int)(200 + sideB), (int)(200 + sideC)};
		graph.drawPolygon(x, y, 4);
	}
	
	@Override
	public String toString() {
		return "Shape: trapezium, " + "area: " + area() + " sq. un., side length: " + sideA + " un., color: " + getColor() + "\n";
	}
}
