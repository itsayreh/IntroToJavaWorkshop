package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot itsayreh = new Robot();
		itsayreh.penDown();
		itsayreh.setSpeed(7);
		itsayreh.setPenColor(155, 35, 70);
		for (int i = 0; i < 4; i++) {
			itsayreh.move(150);
			itsayreh.turn(90);

		}
		// itsayreh.move(90);
		// itsayreh.turn(90);
		// itsayreh.move(90);
		// itsayreh.turn(90);
		// itsayreh.move(90);
		// itsayreh.turn(90);
		// itsayreh.move(90);
		itsayreh.hide();
		itsayreh.penUp();
		itsayreh.move(300);
		itsayreh.turn(180);
		itsayreh.show();
		itsayreh.sparkle();

		itsayreh.penDown();
		itsayreh.setPenColor(0, 155, 70);
		for (int i = 0; i < (360 / 8); i++) {
			itsayreh.move(100);

		}
	}
}
