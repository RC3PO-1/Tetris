package Tetris.Piece;

public class Piece {
  int x; //position is zero indexed off the top left corner
  int y;
  int rotation  = 0;
  String type; // I,O,S,Z,T,L,J

  public Piece(String type) {
    this.type = type;
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

  public PieceTile[][][] getShape() {
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