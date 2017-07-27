/**
 * Shape - абсрактный класс фигуры, от которой наследуются другие классы Квадрат, Треугольник, Круг и Трапеция
 */

package test;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

abstract class Shape {

	//Атрибуты
	private Color color;
	
	//Конструкторы
	protected Shape(){
		Random random = new Random();
		color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
	}
	
	//Методы класса родителя Shape
	public abstract double area();
	
	public abstract void draw(Graphics graph);
	
	public Color getColor(){
		return color;
	}
	
	public String toString() {
		return "Это абстрактный класс Фигура без площади и цвета \n";
	}
}
	
	
	
	
	
	
