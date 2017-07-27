/**
 * Shape - ���������� ����� ������, �� ������� ����������� ������ ������ �������, �����������, ���� � ��������
 */

package test;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

abstract class Shape {

	//��������
	private Color color;
	
	//������������
	protected Shape(){
		Random random = new Random();
		color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
	}
	
	//������ ������ �������� Shape
	public abstract double area();
	
	public abstract void draw(Graphics graph);
	
	public Color getColor(){
		return color;
	}
	
	public String toString() {
		return "��� ����������� ����� ������ ��� ������� � ����� \n";
	}
}
	
	
	
	
	
	
