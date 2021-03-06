package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot itsayreh = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		itsayreh.setSpeed(10);
		// 5. Set the pen width to 5
		itsayreh.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

		// 7. Set the pen color to random
		for (int i = 0; i < 4; i++) {
			itsayreh.setRandomPenColor();

			// 1. Call the drawSquare() method
			drawSquare();

			// 8. Turn the robot 90 degrees to the right
			itsayreh.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		itsayreh.penDown();
		for (int i = 0; i < 360 / 4; i++) {

			itsayreh.move(90);
			itsayreh.turn(90);
		}

		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
