import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int s = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer= JOptionPane.showInputDialog(null,"A teacher has a class of 30 children but only 2 pupils. How is this possible?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("The teacher has two pupils in her eyes")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			s++;
			// 5. Otherwise, say "wrong" and tell them the answer
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		// 6. Add some more riddles
		String riddle = JOptionPane.showInputDialog(null, "What type of shoes do spies wear?");
		if (riddle.equals("Sneakers")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			s++;
		}

		else {
			JOptionPane.showMessageDialog(null, "Incorrect");	
		}
	
	// 2. Make a pop up to show the score
	JOptionPane.showMessageDialog(null, "Your score is " + s);
	}
}


