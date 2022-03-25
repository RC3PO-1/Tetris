class board {
  Tile boardArray[][] = new Tile[10][24];
  Piece currentPiece;

  public board() {
  }

  public void clearBoard() {
    for (int i = 0; i < boardArray.length; i++) {
      for (int j = 0; j < boardArray[i].length; j++) {
        boardArray[i][j] = new Tile("BLANK", true);
      }
    }
  }

  public void advanceFall() {
    Tile[][][] tmp = currentPiece.getShape();
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
    Tile[][][] tmp = currentPiece.getShape();
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

  public void shiftLeft() {

  }

  public void shiftRight() {

  }

  public void spin() {

  }

  public void hardDrop() {

  }

  public void softDrop() {

  }

}