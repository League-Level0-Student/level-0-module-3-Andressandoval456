package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class If_elseif_story {
public static void main(String[] args) {
	String qone;
	qone = JOptionPane.showInputDialog("Red or Black");
		if (qone .equals("red")){
//			System.out.println("red");
			JOptionPane.showMessageDialog(null, "You chose the red car");
			String qrone = JOptionPane.showInputDialog("Do you go to your house or the DMV");
				if (qrone .equals("home")) {
					System.out.println("home");
				}
				else if (qrone .equals("DMV")) {
					System.out.println("DMV");
				}		
}
		else if (qone .equals("black")) {
//			System.out.println("black");
			JOptionPane.showMessageDialog(null, "You chose the black car");
			String qbone = JOptionPane.showInputDialog("Do you go to your house to get food");
			if (qbone .equals("house")) {
				String qbtwo = JOptionPane.showInputDialog(null, "You get to your house, do you watch tv or make yourself something to eat?");
				if (condition) {
					
				} else {

				}
			}
			else if (qbone .equals("food")) {
				String qbtree = JOptionPane.showInputDialog(null, "Do you get pizza , hamburgers or tacos");
				if (qbtree .equals ("pizza")) {
					JOptionPane.showMessageDialog(null, "You got a pizza");
				}
				else if (qbtree .equals("hamburgers")) {
					JOptionPane.showMessageDialog(null, "You got a hamburger");
					
				}
				else if (qbtree .equals("tacos")) {
					JOptionPane.showMessageDialog(null, "You got tacos");
				}
			}
		}
	
}

}

