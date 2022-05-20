package Tetris;
import javax.swing.JPanel;

import Tetris.Background.BkgManager;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

  Player test = new Player();
  Thread gameThread;

  public GamePanel() {
    this.setPreferredSize(new Dimension(Constants.screenWidth, Constants.screenHeight));
    this.setDoubleBuffered(true);
  }

  public void startGameThread() {
    gameThread = new Thread(this);
    gameThread.start();
  }

  @Override
  public void run() {
    double cycleTime = 1000000000 / Constants.FPS;
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
    test.Periodic();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    test.draw(0, 0, g2);
  
    g2.dispose();
  }




}