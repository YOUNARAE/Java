package chapter07.Exercise;

public class Rectangle extends Shape {
	//필드
	private double width;
	private double height;
	
	//생성자
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//메소드
	@Override
	public double area() {
		return Math.round(width * height*100)/100; 
	}
	
	@Override
	public double perimeter() {
		return Math.round(width + width + height + height*100)/100;
	}
	
	public String toString() {
		return String.format("도형의 모양 : 직사각형, 둘레:"+ perimeter()+"cm, 넓이: "+ area()+"㎠");
	}
	
}
