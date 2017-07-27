package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Square extends Shape {
	//���������� �������� ������ ���������� Square
	private Color color;
	private Random random = new Random();
	private double side;
    private double perimeter;
    
    //������������
    public Square(Random random, double side){
    	this.side = side;
    }
    
    protected Square(){
		super();
		side = random.nextDouble() * 100; 
	}
    
    //���������� ����� ������ Square, ������������ ��������
    public double perimeter(){
    	return perimeter = side * 4;
    }
    
    //���������������� ������ ������-�������� Shape
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
		return "������: �������, " + "�������: " + area() + " ��. ��., ��������: " + perimeter() + " ��., ����: " + color + "\n";
	}
}
