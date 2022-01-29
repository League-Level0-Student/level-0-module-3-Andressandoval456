package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog(null, "Are You Happy?");
			if (question .equals("yes")) {
				JOptionPane.showMessageDialog(null, "Keep doing what yuo are doing");
			}
			else if (question .equals("no")) {
				String doyou = JOptionPane.showInputDialog(null, "D You hant to be Happy?");
				if (doyou .equals("yes")){
					JOptionPane.showMessageDialog(null, "Change somthing");
				}
				else if (doyou .equals ("no")) {
					JOptionPane.showMessageDialog(null, "Keep doing what yuo are doing");
				}
			}

			
			}
		
	}

