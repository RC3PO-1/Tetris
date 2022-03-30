package Tetris;

import Tetris.Piece.Piece;

class Player {
    Piece nextPiece, currentPiece;
    Board pBoard;
    int linesCleared, level, points;

    int score;

    public Player() {
        init();
    }

    public void init() {
        this.nextPiece = new  Piece();
        this.currentPiece = new  Piece();
        pBoard.clearBoard();
        linesCleared = 0;
        level = 1;
        points = 0;
    }

    public void Periodic() {
        pBoard.advanceFall();
    }

    // ========================================================================
    // Setters and Getters
    // ========================================================================
    public Board getBoard(){
        return this.pBoard;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints( int points) {
        this.points = points;
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getlines(){
        return this.linesCleared;
    }

    public void setlines(int lines){
        this.linesCleared = lines;
    }

    // ========================================================================
    // Controls
    // ========================================================================
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
