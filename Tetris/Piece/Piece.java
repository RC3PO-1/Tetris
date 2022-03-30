package Tetris.Piece;

import java.util.Random;

public class Piece {
  int x = 0; //position is zero indexed off the top left corner
  int y = 0;
  int rotation  = 0;
  String type; // I,O,S,Z,T,L,J
  Random rand = new Random();

  /**
   * create new piece leave blank for random piece
   * @param type I,O,S,Z,T,L,J
   */
  public Piece(String type) {
    this.type = type;
  }

  public Piece(){
    int max = 7;
    int min = 1;
    switch (rand.nextInt(max - min + 1) + min) {
      case 1:
        type = "I";
        break;
      case 2:
        type = "O";
        break;
      case 3:
        type = "S";
        break;
      case 4:
        type = "Z";
        break; 
      case 5:
        type = "T";
        break;
      case 6:
        type = "L";
        break;
      case 7:
        type = "J";
        break;
    }
  }


  public void resetPos(){
    this.x = 0;
    this.y = 0;
  }
  
  public int getX() {
    return this.x;
  }

  public void setX(int input) {
    this.x = input;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int input) {
    this.y = input;
  }

  public int getRotation() {
    return this.rotation;
  }

  public void setRotation(int input) {
    this.rotation = input;
  }
  
  public String getType() {
    return this.type;
  }

  public void setType(String input) {
    this.type = input.toUpperCase();
  }

  public Block[][][] getShape() {
    switch (type) {
      case "I":
        return pieceConst.pI;
      case "O":
        return pieceConst.pO;
      case "S":
        return pieceConst.pS;
      case "Z":
        return pieceConst.pZ;
      case "T":
        return pieceConst.pT;
      case "L":
        return pieceConst.pL;
      case "J":
        return pieceConst.pJ;
      default:
        return pieceConst.pX;

    }

  }

}