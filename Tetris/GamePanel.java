package Tetris;
import javax.swing.JPanel;


import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
  

  Thread gameThread;
  Player testPlayer = new Player();

  public GamePanel() {
    this.setPreferredSize(new Dimension(GameConst.screenWidth, GameConst.screenHeight));
    this.setDoubleBuffered(true);
    this.addKeyListener(testPlayer);
    this.setFocusable(true);
    this.setFocusTraversalKeysEnabled(false);
  }

  public void startGameThread() {
    gameThread = new Thread(this);
    gameThread.start();
  }

  @Override
  public void run() {
    double cycleTime = 1000000000 / GameConst.FPS;
    double nextDraw = System.nanoTime() + cycleTime;

    while (gameThread != null) {
      update();
      repaint();

      try {
        double toNextDraw = (nextDraw - System.nanoTime()) / 1000000;
        if (toNextDraw < 0) {
          toNextDraw = 0;
        }
        nextDraw += cycleTime;
        Thread.sleep((long) toNextDraw);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void update() {
    testPlayer.Periodic();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    testPlayer.draw(0, 0, g2);
    g2.dispose();
  }




}