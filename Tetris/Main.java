package Tetris;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

class Main {
  public static void main(String[] args) {
    JFrame window = new JFrame();
    GamePanel gamePanel = new GamePanel();
    gamePanel.startGameThread();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setTitle("Tetris");
    window.add(gamePanel);
    try {
      window.setIconImage(ImageIO.read(new File("Tetris/Resources/Icon.png")));
    } catch (IOException e) {
      e.printStackTrace();
    }
    window.pack();
    window.setLocationRelativeTo(null);
    window.setVisible(true);
  }
}