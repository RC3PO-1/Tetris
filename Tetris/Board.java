package Tetris;

import Tetris.Piece.Piece;
import Tetris.Piece.PieceTile;

class board {
  private PieceTile boardArray[][] = new PieceTile[10][24];
  private Piece currentPiece;

  public board() {
  }

  public PieceTile[][] getBoard() {
    return boardArray;
  }

  public void clearBoard() {
    for (int i = 0; i < boardArray.length; i++) {
      for (int j = 0; j < boardArray[i].length; j++) {
        boardArray[i][j] = new PieceTile("X", true);
      }
    }
  }

  public void advanceFall() {
    PieceTile[][][] tmp = currentPiece.getShape();
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
    PieceTile[][][] tmp = currentPiece.getShape();
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

}