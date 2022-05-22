package Tetris;

import Tetris.Piece.Piece;

import java.awt.*;

class Board {
  private Block boardArray[][] = new Block[GameConst.boardRow][GameConst.boardCol];

  // boardArray[Row][Col]
  public Board() {
    clearBoard();
  }

  /**
   * returns board array
   */
  public Block[][] getBoard() {
    return boardArray;
  }

  /**
   * sets board array to all blanks
   */
  public void clearBoard() {
    for (int i = 0; i < boardArray.length; i++) {
      for (int j = 0; j < boardArray[i].length; j++) {
        boardArray[i][j] = new Block("X", true);
      }
    }
  }

  /**
   * checks if slide move is in bounds and returs true if so.
   * 
   * @param input
   * @param direction true for right, false for left
   * @return if slide is in bounds
   */
  public boolean goodSlide(Piece input, boolean direction) {
    Piece currentPiece = input;
    Block[][][] tmp = currentPiece.getShape();
    boolean goodMove = true;

    if (direction) {
      for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) { // iterate though y
        for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) { // iterate though x
          if (!tmp[currentPiece.getRotation()][i][j].getBlank()) { // check if current index in piece array is blank
            if ((j + currentPiece.getX() + 1)  > (GameConst.boardCol - 1)) {// edge
              goodMove = false;
            } else if ((i + currentPiece.getY()) < (GameConst.boardRow - 1)
                && (j + currentPiece.getX() + 1) < (GameConst.boardCol - 1)) { // check if the next part will be in
                                                                               // bounds
              if (!(this.boardArray[(i + currentPiece.getY())][j + currentPiece.getX() + 1].getBlank())) { // if the
                                                                                                           // space
                goodMove = false; // is not blank

              }
            }
          }
        }
      }

    } else {
      for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) { // iterate though y
        for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) { // iterate though x
          if (!tmp[currentPiece.getRotation()][i][j].getBlank()) { // check if current index in piece array is blank
            if ((j + currentPiece.getX() - 1) < (0)) {// edge
              goodMove = false;
            } else if ((i + currentPiece.getY()) < (GameConst.boardRow - 1)
                && (j + currentPiece.getX() - 1) < (GameConst.boardCol - 1)) { // check if the next part will be in
                                                                               // bounds
              if (!(this.boardArray[(i + currentPiece.getY())][j + currentPiece.getX() - 1].getBlank())) { // if the
                                                                                                           // space
                goodMove = false; // is not blank

              }
            }
          }
        }
      }
    }

    return goodMove;

  }

  /**
   * returns true if the next fall is not blocked
   * 
   * @param input
   * @return
   */
  public boolean goodFall(Piece input) {
    Piece currentPiece = input;
    Block[][][] tmp = currentPiece.getShape();
    boolean goodMove = false;

    for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) { // iterate though y
      for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) { // iterate though x
        if (!tmp[currentPiece.getRotation()][i][j].getBlank()) { // check if current index in piece array is blank
          if ((i + currentPiece.getY()) <= (GameConst.boardRow - 1)) {// in the baord
            goodMove = true;
          } else if ((i + currentPiece.getY()) < (GameConst.boardRow - 1)
              && (j + currentPiece.getX()) < (GameConst.boardCol - 1)) { // check if the next part will be in bounds
            if (!(boardArray[(i + currentPiece.getY() + 1)][j].getBlank())) { // if the space is not blank
              goodMove = true;
            }
          }
        }
      }
    }

    return goodMove;

  }

  /**
   * adds piece to board, returns true if piece was added
   * 
   * @param input
   * @return
   */
  public boolean addPieceToBoard(Piece input) {
    Piece currentPiece = input;
    Block[][][] tmp = currentPiece.getShape();
    boolean onBottom = false;
    for (int i = 0; i < tmp[currentPiece.getRotation()].length; i++) { // iterate though y
      for (int j = 0; j < tmp[currentPiece.getRotation()][i].length; j++) { // iterate though x
        if (!tmp[currentPiece.getRotation()][i][j].getBlank()) { // check if current index in piece array is blank
          if ((i + currentPiece.getY()) >= (GameConst.boardRow - 1)) {// touching bottom of board
            onBottom = true;
          } else if ((i + currentPiece.getY()) < (GameConst.boardRow - 1)
              && (j + currentPiece.getX()) < (GameConst.boardCol - 1)) { // check if the next part will be in bounds
            if (!(this.boardArray[(i + currentPiece.getY() + 1)][j + currentPiece.getX()].getBlank())) { // if the space
                                                                                                         // is not blank
              onBottom = true;
            }
          }
        }
      }
    }

    if (onBottom) {
      for (int i = 0; i < tmp[currentPiece.getRotation()][0].length; i++) { // y
        for (int j = 0; j < tmp[currentPiece.getRotation()].length; j++) { // x
          if (!tmp[currentPiece.getRotation()][j][i].getBlank()) {
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
    for (int i = 0; i < GameConst.boardCol; i++) {
      for (int j = 0; j < GameConst.boardRow; j++) {
        boardArray[j][i].draw(this.boardArray[j][i].getColor(), GameConst.tileSize * (i + x),
            GameConst.tileSize * (j + y), g2);
      }
    }
  }
}