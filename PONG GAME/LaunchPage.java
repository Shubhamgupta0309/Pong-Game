import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;


public class LaunchPage implements ActionListener{
 
 JFrame frame = new JFrame();
 JButton single = new JButton("Click to start a new single player game");
 JButton multiple = new JButton("Click to start a new multiplayer-player game");

 JButton exitGame = new JButton("Click to Exit game");

 

 LaunchPage(){

  single.setBounds(450,250,500,70);
  multiple.setBounds(450,350,500,70);
  exitGame.setBounds(450,450,500,70);


  frame.add(single);
  frame.add(multiple);
  frame.add(exitGame);

  single.addActionListener(this);
  multiple.addActionListener(this);
  exitGame.addActionListener(this);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	frame.setUndecorated(true);
  frame.setLayout(null);
  frame.setVisible(true);
  frame.setLocationRelativeTo(null);
  
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource()==single) {
   frame.dispose();
   new GameFrame(false);
  }
  if(e.getSource()==multiple) {
    frame.dispose();
    new GameFrame(true);
   }
  if(e.getSource()==exitGame) {
    System.exit(0);
   }
 }
}
