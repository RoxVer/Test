package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Square extends Shape {
	//Уникальные атрибуты класса наследника Square
	private Color color;
	private Random random = new Random();
	private double side;
    private double perimeter;
    
    //Конструкторы
    public Square(Random random, double side){
    	this.side = side;
    }
    
    protected Square(){
		super();
		side = random.nextDouble() * 100; 
	}
    
    //Уникальный метод класса Square, возвращающий периметр
    public double perimeter(){
    	return perimeter = side * 4;
    }
    
    //Переопределенные методы класса-родителя Shape
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
		return "Фигура: квадрат, " + "площадь: " + area() + " кв. ед., периметр: " + perimeter() + " ед., цвет: " + color + "\n";
	}
}
