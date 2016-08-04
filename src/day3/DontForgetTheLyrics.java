package day3;
import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "When the song pauses, it's your turn to sing!");

		String keithletitgo = "keith22.wav";
		// 5. Use the playSound method to play your song.
		playSound(keithletitgo);

		// 6. Make a pop-up for the player to type their answer.
	String answer=JOptionPane.showInputDialog("enter your answer");

		// 7. If they answered correctly, tell them that they were right.

	
if (answer.equals("Heaven knows I've tried")) {
JOptionPane.showMessageDialog(null,"YAY you were right, you obviously know a lot about Frozen.");	
}
else{
JOptionPane.showMessageDialog(null, "WRONG, GO BACK AND WATCH THE MOVIE OR AT THE VERY LEAST, LISTEN TO THE SONG");
		// 8. Otherwise, tell them they are wrong, and give them the answer.

	


}
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}
