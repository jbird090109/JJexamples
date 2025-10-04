import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Canvas");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton button = new JButton("Click Me");
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked");
				JOptionPane.showMessageDialog(frame, "Button Clicked");
			}
		});
	}

}
