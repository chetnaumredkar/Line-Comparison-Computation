package com.bridgelabz;

public class LineUsingMethods {
	int x1, x2, y1, y2, a1, a2, b1, b2;
	double dis, dis1;

	public void lengthOfFirstLine(int x1,int x2,int y1,int y2) {
		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + dis);
	}

	public void lengthOfSecondLine(int a1,int a2,int b1, int b2) {
		dis1 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("distancebetween" + "(" + a1 + "," + a2 + ")," + "(" + b1 + "," + b2 + ")=" + dis1);
	}

	public void isEqual() {
		String line_1=String.valueOf(dis);
		String line_2=String.valueOf(dis1);
		if(line_1.equals(line_2)) {
			System.out.println("both lines are equal");
		}
		else {
			System.out.println("both lines are not equal");
		}
	}

	public void comparison() {
		if (Double.compare(dis, dis1) == 0) {

			System.out.println("Both Lines are equal");
		} else if (Double.compare(dis, dis1) < 0) {

			System.out.println("line1 is less than line2");
		} else {

			System.out.println("line1 is greater than line2");
		}
	}
	public static void main(String[] args) {
		LineUsingMethods obj=new LineUsingMethods();
		obj.lengthOfFirstLine(10, 20, 10, 40);
		obj.lengthOfSecondLine(2,3,11,4);
		obj.isEqual();
		obj.comparison();
		
	}
}
