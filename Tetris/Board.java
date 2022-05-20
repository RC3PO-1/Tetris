package Tetris;

import Tetris.Piece.Piece;
import Tetris.Piece.Block;
import java.awt.*;

class Board {
  private Block boardArray[][] = new Block[Constants.boardRow][Constants.boardCol];

  // boardArray[Row][Col]
  public Board() {
    clearBoard();
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

  public boolean goodMove(Piece input) {
    Piece currentPiece = input;
    Block[][][] tmp = currentPiece.getShape();
    boolean goodMove = false;

    for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) { // iterate though y
      for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) { // iterate though x
        if (!tmp[currentPiece.getRotation()][i][j].getBlank()) { // check if current index in piece array is blank
          if ((i + currentPiece.getY()) <= (Constants.boardRow - 1)) {// in the baord
            goodMove = true;
          } else if ((i + currentPiece.getY()) < (Constants.boardRow - 1)
              && (j + currentPiece.getX()) < (Constants.boardCol - 1)) { // check if the next part will be in bounds
            if (!(boardArray[(i + currentPiece.getY() + 1)][j].getBlank())) { // if the space is not blank
              goodMove = true;
            }
          }
        }
      }
    }

    return goodMove;

  }

  public boolean addPieceToBoard(Piece input) {
    Piece currentPiece = input;
    Block[][][] tmp = currentPiece.getShape();
    boolean onBottom = false;
    for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) { // iterate though y
      for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) { // iterate though x
        if (!tmp[currentPiece.getRotation()][i][j].getBlank()) { // check if current index in piece array is blank
          if ((i + currentPiece.getY()) >= (Constants.boardRow - 1)) {// touching bottom of board
            onBottom = true;
          } else if ((i + currentPiece.getY()) < (Constants.boardRow - 1)
              && (j + currentPiece.getX()) < (Constants.boardCol - 1)) { // check if the next part will be in bounds
            if (!(this.boardArray[(i + currentPiece.getY() + 1)][j+currentPiece.getX()].getBlank())) { // if the space is not blank
              onBottom = true;
            }
          }
        }
      }
    }

    if (onBottom) {
      for (int i = 0; i < tmp[currentPiece.getRotation()][0].length; i++) { // y 
        for (int j = 0; j < tmp[currentPiece.getRotation()].length; j++) { // x
          if(!tmp[currentPiece.getRotation()][j][i].getBlank()){
          this.boardArray[currentPiece.getY() + j][currentPiece.getX() + i] = tmp[currentPiece.getRotation()][j][i];
          }
        }
      }
    }
    return onBottom;
  }

  public int checkLines() {
    return 0;
  }

  public int removeLines() {
    return 0;
  }

  /**
   * Draws board on screen
   * 
   * @param x  X offset for board from top left corner
   * @param y  Y offset for board from top left corner
   * @param g2
   */
public void draw(int x, int y, Graphics2D g2) {
    for (int i = 0; i < Constants.boardCol; i++) {
      for (int j = 0; j < Constants.boardRow; j++) {
        boardArray[j][i].draw(this.boardArray[j][i].getColor(), Constants.tileSize * (i+x), Constants.tileSize *(j+y), g2);
      } 
    }
  }
}