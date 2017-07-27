package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Square extends Shape {
	//Unique attributes of a child class Square
	private Random random = new Random();
	private double side;
    private double perimeter;
    
    //Constructors
    public Square(Random random, double side){
    	this.side = side;
    }
    
    protected Square(){
		super();
		side = random.nextDouble() * 100; 
	}
    
    //Unique methods of a Square class, which returns perimeter
    public double perimeter(){
    	return perimeter = side * 4;
    }
    
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side * side;
	}
	
	@Override
	public void draw(Graphics graph) {
		graph.drawRect(200, 200, (int)(side), (int)(side));
	}
	
	@Override
	public String toString() {
		return "Shape: square, " + "area: " + area() + " sq. un., perimeter: " + perimeter() + " un., color: " + getColor() + "\n";
	}
}
