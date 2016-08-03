package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String Answer = JOptionPane.showInputDialog("What do ROTC kids do?");
		JOptionPane.showMessageDialog(null, Answer + "Drill!");
		String Answer1 = JOptionPane.showInputDialog("Why do we do it?");
		JOptionPane.showMessageDialog(null, Answer + "Cause we wanna!");
		String Answer2 = JOptionPane.showInputDialog("By the right flank..");
		JOptionPane.showMessageDialog(null, Answer2 + "MARCH");

	}

}
