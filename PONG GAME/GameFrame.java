import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	GamePanel panel;
	boolean multiplayer;
	
	GameFrame(boolean multiplayer){
		this.multiplayer = multiplayer;
		panel = new GamePanel(multiplayer);
		this.add(panel);
		this.setTitle("Pong Game");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}