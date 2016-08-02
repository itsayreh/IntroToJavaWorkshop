package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new RobotX
		Robot itsayreh = new Robot();

		// 5. Set your robot's pen to the down position
		itsayreh.penDown();

		// 3. Set the robot to go at max speed (10)X
		itsayreh.setSpeed(10);

		// 4. Do the following (steps 6-9) 75 times
		for (int i = 0; i < 75; i++) {

			// 7. Change the pen color to random
			itsayreh.setRandomPenColor();

			// 6. Move the robot 5 times the current line number you are drawing
			// (5*i)
			itsayreh.move(9 * i);

			// 2. Turn the robot 1/3 of 360 degrees to the rightX
			itsayreh.turn(360 / -5);

			// 8. Change the number of sides to 7 (don’t add a new line of code
			// for
			// this one!)

			// 9. Set the pen width to i
			itsayreh.setPenWidth(i);

		}
	}
}
