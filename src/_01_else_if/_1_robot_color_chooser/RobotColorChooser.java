
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
		while(loop<8) {
//		bob.move(100);
//		bob.turn(90);
		String question;
			
		//3. Set the pen width to 10
		bob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		question= JOptionPane.showInputDialog(null, "what color pen would you like to use?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (question .equalsIgnoreCase ("red")) {
			bob.setPenColor(Color.RED);
			}
		else if (question .equalsIgnoreCase ("blue")) {
			bob.setPenColor(Color.blue);
			}
		else if (question .equalsIgnoreCase ("yellow")) {
			bob.setPenColor(Color.yellow);
		}
        //6. If the user doesn't enter anything, choose a random color
		else if (question .equalsIgnoreCase ("")) {
			bob.setPenColor(Color.BLACK);
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		bob.penDown();
		bob.move(100);
		bob.turn(45);
		loop+=1;
		}



	}
}
