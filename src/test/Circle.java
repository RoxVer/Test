package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Circle extends Shape {
	//���������� �������� ������ ���������� Circle
	private Color color;
	private Random random = new Random();
    private double radius;
    
    //������������
    public Circle(Random random, double radius){
    	super();
    	this.radius = radius;
    }
    
    protected Circle(){
		super();
		radius = random.nextDouble() * 100; 
	}
    
    //���������� ����� ������ Circle, ������� ���������� �������
    public double diameter(){
    	return radius * 2;
    }
    
    //���������������� ������ ������-�������� Shape
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
		return "������: ����, " + "�������: " + area() + " ��. ��., �������: " + diameter() + " ��., ����: " + color + "\n";
	}
}
