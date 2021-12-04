
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {
		
		//1. Create a new Robot
		Robot bob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bob.setSpeed(15);	
		int loop = 0;
		while(loop<4) {
//		bob.move(100);
//		bob.turn(90);
			
		//3. Set the pen width to 10
		bob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		JOptionPane.showInputDialog(null, "what color pen would you like to use?");
		//5. Use an if/else statement to set the pen color that the user requested
		if ("red" != null) {
			bob.setPenColor(Color.RED);
			}
		if ("blue" != null) {
			bob.setPenColor(Color.blue);
			}
		if ("yellow" != null) {
			bob.setPenColor(Color.yellow);
		}
        //6. If the user doesn't enter anything, choose a random color
		if ("" != null) {
			bob.setPenColor(Color.black);
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		bob.penDown();
		bob.move(100);
		bob.turn(90);
		loop+=1;
		}



	}
}
