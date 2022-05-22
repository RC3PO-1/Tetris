package Tetris;


import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.imageio.ImageIO;
/**
 * This class extends the tile class to add features for pieces
 */
public class Block{
  boolean blank;
  String color;

  private Image I_G;
  private Image I_C;
  private Image I_B;
  private Image I_R;
  private Image I_Y;
  private Image I_O;
  private Image I_M;
  private Image I_X;

  public Block() {
      try {
          I_G = ImageIO.read(new File("Tetris/Resources/Green.png"));
          I_C = ImageIO.read(new File("Tetris/Resources/Cyan.png"));
          I_B = ImageIO.read(new File("Tetris/Resources/Blue.png"));
          I_R = ImageIO.read(new File("Tetris/Resources/Red.png"));
          I_Y = ImageIO.read(new File("Tetris/Resources/Yellow.png"));
          I_O = ImageIO.read(new File("Tetris/Resources/Orange.png"));
          I_M = ImageIO.read(new File("Tetris/Resources/Magenta.png"));
          I_X = ImageIO.read(new File("Tetris/Resources/Grey.png"));
      } catch (IOException e) {
          e.printStackTrace();
      }
  }


  private Image getImage(String color) {
      switch (color) {
          case "B":
              return I_B;
          case "C":
              return I_C;
          case "G":
              return I_G;
          case "M":
              return I_M;
          case "O":
              return I_O;
          case "R":
              return I_R;
          case "Y":
              return I_Y;
          default:
              return I_X;
      }
  }

  /**
   * a tile on the game board
   * 
   * @param color the clolr the tile will be
   */
  public Block(String color, boolean blank) {
    this.color = color;
    this.blank = blank;
  }

  /**
   * returns color of the tile
   * 
   * @return string representing the tile color
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Sets the color of the tile
   * 
   * @param input tileColor string
   */
  public void setColor(String input) {
    this.color = input;
  }

  /**
   * gets the blank state of the tile
   * 
   * @return boolean is the tile blank
   */
  public boolean getBlank() {
    return this.blank;
  }

  /**
   * sets the blank state of the tile
   * 
   * @param input boolean is the tile blank
   */
  public void setBlank(boolean input) {
    this.blank = input;
  }

  public void draw(String color, int x, int y, Graphics2D g2) {
    if(!this.blank){
      g2.drawImage(getImage(color), x, y, Constants.tileSize, Constants.tileSize, null);
    }
  }

  
  public String toString(){
    return this.color;
  }

}