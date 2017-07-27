package test;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		int ranNumber = (int)(random.nextDouble() * 10);
		Shape[] shapes = new Shape[ranNumber];
		
		int swt = 0;
		for(int i = 0; i < ranNumber; i++){
			swt = (int)(random.nextDouble() * 3);
			switch (swt) {
			    case 1: 
			    	shapes[i] = new Circle();
			        break;
			    case 2: 
			    	shapes[i] = new Square();
			    	break;
			    case 3: 
			    	shapes[i] = new Triangle();
			    	break;
			    case 4: 
			    	shapes[i] = new Trapezium();
			    	break;
			}
		}
		for(int i = 0; i < ranNumber; i++){
		    shapes[i].toString();
		}
	}

}
