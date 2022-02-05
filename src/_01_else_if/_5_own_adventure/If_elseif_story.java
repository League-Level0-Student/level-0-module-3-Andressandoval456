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
				}		if_
}
		else if (qone .equals("black")) {
//			System.out.println("black");
			JOptionPane.showMessageDialog(null, "You chose the black car");
			String qbone = JOptionPane.showInputDialog("Y");
			
		}
	
}

}


