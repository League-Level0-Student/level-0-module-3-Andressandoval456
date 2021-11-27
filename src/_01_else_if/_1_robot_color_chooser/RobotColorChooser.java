
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;

public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {
		
		//1. Create a new Robot
		Robot bob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		bob.mouseMove(10, 10);
		bob.mouseMove(20, 10);
		bob.mouseMove(20, 20);
		bob.mouseMove(10, 20);
		bob.mouseMove(10, 10);	
		//3. Set the pen width to 10
	//	bob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		JOptionPane.showInputDialog(null, "what color pen would you like to use?");
		//5. Use an if/else statement to set the pen color that the user requested
		if ("red" != null) {
			(() bob).setPenColor(Color.RED);
			
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
