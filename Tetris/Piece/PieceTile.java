package Tetris.Piece;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PieceTile {
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

  /**
   * a tile on the game board
   * 
   * @param color the clolr the tile will be
   */
  public PieceTile(String color, boolean blank) {
    this.color = color;
    this.blank = blank;

    try {
      I_G = ImageIO.read(new File("/Resources/basicTile.png"));
      I_C = ImageIO.read(new File("/Resources/basicTile.png"));
      I_B = ImageIO.read(new File("/Resources/basicTile.png"));
      I_R = ImageIO.read(new File("/Resources/basicTile.png"));
      I_Y = ImageIO.read(new File("/Resources/basicTile.png"));
      I_O = ImageIO.read(new File("/Resources/basicTile.png"));
      I_M = ImageIO.read(new File("/Resources/basicTile.png"));
      I_X = ImageIO.read(new File("/Resources/blankTile.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
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

  public Image getImage() {
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

}