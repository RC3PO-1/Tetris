package Tetris;

import Tetris.Piece.Piece;
import Tetris.Piece.Block;
import java.awt.*;

class Board {
  private Block boardArray[][] = new Block[Constants.boardCol][Constants.boardRow];
  private Piece currentPiece;

  public Board() {
  }

  public Block[][] getBoard() {
    return boardArray;
  }

  public void clearBoard() {
    for (int i = 0; i < boardArray.length; i++) {
      for (int j = 0; j < boardArray[i].length; j++) {
        boardArray[i][j] = new Block("X", true);
      }
    }
  }

  public void advanceFall() {
    Block[][][] tmp = currentPiece.getShape();
    boolean goodMove = true;

    for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) {
      for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) {
        if (!tmp[currentPiece.getRotation()][i][j].getBlank()) {
          if (!((currentPiece.getY() + 1 + i >= 0) && (currentPiece.getY() + 1 + i < 24)
              && (currentPiece.getX() + j >= 0) && (currentPiece.getX() + j < 10))) {
            if (!(boardArray[currentPiece.getY() + 1 + i][currentPiece.getX() + j].getBlank())) {
              goodMove = false;
            }
          }
        }
      }
    }

    if (goodMove) {
      currentPiece.setY(currentPiece.getY() + 1);
    }

  }

  public void addPieceToBoard() {
    Block[][][] tmp = currentPiece.getShape();
    boolean onBottom = false;

    for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) {
      for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) {
        if (!tmp[currentPiece.getRotation()][i][j].getBlank()) {
          if (!((currentPiece.getY() + 1 + i >= 0) && (currentPiece.getY() + 1 + i < 24)
              && (currentPiece.getX() + j >= 0) && (currentPiece.getX() + j < 10))) {
            if (!(boardArray[currentPiece.getY() + 1 + i][currentPiece.getX() + j].getBlank())) {
              onBottom = true;
            }
          }
        }
      }
    }

    if (onBottom) {
      for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) {
        for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) {
          boardArray[currentPiece.getY() + i][currentPiece.getX() + j] = tmp[currentPiece.getRotation()][i][j];
        }
      }
    }

  }

  public int checkLines() {
    return 0;
  }

  public int removeLines() {
    return 0;
  }
  
  /**
   * Draws board on screen
   * @param x X offset for board from top left corner
   * @param y Y offset for board from top left corner
   * @param g2
   */
  public void draw(int x, int y, Graphics2D g2){
    for(int i = x; i < Constants.boardCol+x; i++){
      for(int j = y; j < Constants.boardRow+y; j++){
          new Tile().draw("B", Constants.tileSize*i, Constants.tileSize*j, g2);
      }
    }
  }
}