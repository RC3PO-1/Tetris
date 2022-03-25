package Tetris;
import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
  final int origionalTileSize = 16;
  final int scale = 3;

  final int tileSize = origionalTileSize * scale;
  final int maxScreenCol = 16;
  final int maxScreenRow = 12;
  final int screenWidth = tileSize * maxScreenCol;
  final int screenHeight = tileSize * maxScreenRow;

  final int FPS = 60;

  Thread gameThread;

  public GamePanel() {
    this.setPreferredSize(new Dimension(screenWidth, screenHeight));
    this.setBackground(Color.GRAY);
    this.setDoubleBuffered(true);
  }

  public void startGameThread() {
    gameThread = new Thread(this);
    gameThread.start();
  }

  @Override
  public void run() {
    double cycleTime = 1000000000 / FPS;
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

  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
    

    g2.dispose();
  }




}