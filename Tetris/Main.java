package Tetris;
import javax.swing.JFrame;

class Main {
  public static void main(String[] args) {
    JFrame window = new JFrame();
    GamePanel gamePanel = new GamePanel();
  
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setTitle("Tetris");
    window.add(gamePanel);
    window.pack();
    window.setLocationRelativeTo(null);
    window.setVisible(true);
  }
}