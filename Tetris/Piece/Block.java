package Tetris.Piece;


import java.awt.Graphics2D;

import Tetris.Tile;

public class Block extends Tile{
  boolean blank;
  String color;


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

  @Override
  public void draw(String color, int x, int y, Graphics2D g2) {
    if(!this.blank){
      super.draw(color, x, y, g2);
    }
  }

  
  public String toString(){
    return this.color;
  }

}