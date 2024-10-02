package module7;

class Shape {
	void calArea(String shape, int a, int b) {
		System.out.println("CalArea of shape class");

	}

	void display() {
		System.out.println("Display shape of the class");

	}

	void fun1() {
		System.out.println("Fun1 of shape class");
	}
}

class Rectangle extends Shape {
	void calArea(String shape, int a, int b) {
		System.out.println("Area of Rectangle is: " + (a * b));
	}

	void display() {
		super.display();
		super.fun1();
		System.out.println("Display Rectangle of the class");
	}

}

public class FunctionOverriding {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calArea("Shape", 10, 20);
		shape.display();

		System.out.println("--------------------------------");
		Rectangle rectangle = new Rectangle();
		rectangle.calArea("Rectangle", 20, 10);
		rectangle.display();

		System.out.println("---------------------------------------");
		shape = new Rectangle();// dynamic
		shape.calArea("Rect", 30, 10);
		shape.display();
	}

}
