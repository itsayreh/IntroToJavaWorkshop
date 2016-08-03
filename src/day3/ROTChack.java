package day3;

import javax.swing.JOptionPane;

public class ROTChack {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello Cadet");
		JOptionPane.showMessageDialog(null, "How are you today?");
		String Answer = JOptionPane.showInputDialog("");
		JOptionPane.showMessageDialog(null, "Ok");
		JOptionPane.showMessageDialog(null, "There has been an error found on your recent credit card transaction.");
		String Answer1 = JOptionPane.showInputDialog("Please enter the last four digits of your credity card number");
		JOptionPane.showInputDialog(null, Answer1 + ".  Is this correct?");
		String Answer2 = JOptionPane.showInputDialog(null, "Please state your full name");
		JOptionPane.showInputDialog(null, Answer2 + ". Is this correct?");
		JOptionPane.showInputDialog(null, "Now that were all cleared up, please state your rank.");
		String Answer3 = JOptionPane.showInputDialog(null,
				"Your card will be cancelled, please enter your full adress.");
		JOptionPane.showInputDialog(null, Answer3 + ".  Is this correct?");
		JOptionPane.showMessageDialog(null, "Kidding, calm down. Its Beale.");
		JOptionPane.showMessageDialog(null, "PRANKEDDD");

	}

}
