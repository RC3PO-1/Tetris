package Tetris;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class inputHandler implements KeyListener{
    public boolean P1_L, P1_R, P1_S, P1_H, P1_C, P1_CC;
    public boolean P2_L, P2_R, P2_S, P2_H, P2_C, P2_CC;

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_W:
                P1_H = true;
              break;
            case KeyEvent.VK_A:
                P1_L = true;
              break;
            case KeyEvent.VK_S:
                P1_S = true;
              break;
            case KeyEvent.VK_D:
                P1_R = true;
              break;
            case KeyEvent.VK_Z:
                P1_CC = true;
              break;
            case KeyEvent.VK_X:
                P1_C = true;
              break;
          }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_W:
                P1_H = false;
              break;
            case KeyEvent.VK_A:
                P1_L = false;
              break;
            case KeyEvent.VK_S:
                P1_S = false;
              break;
            case KeyEvent.VK_D:
                P1_R = false;
              break;
            case KeyEvent.VK_Z:
                P1_CC = false;
              break;
            case KeyEvent.VK_X:
                P1_C = false;
              break;
          }
        
    }
}