package Tetris;

import Tetris.Piece.Piece;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.w3c.dom.events.Event;

class Player implements KeyListener {
    Piece nextPiece, currentPiece;
    Board pBoard = new Board();
    int linesCleared, level, points;

    int score;

    public Player() {
        init();
    }

    public void init() {
        this.nextPiece = new Piece();
        this.currentPiece = new Piece();
        pBoard.clearBoard();
        linesCleared = 0;
        level = 1;
        points = 0;
    }

    public void Periodic() {
        if (pBoard.addPieceToBoard(currentPiece)) {
            currentPiece = nextPiece;
            nextPiece = new Piece();
        } else if (pBoard.goodMove(currentPiece)) {
            currentPiece.setY(currentPiece.getY() + 1);
        }

    }

    // ========================================================================
    // Setters and Getters
    // ========================================================================
    public Board getBoard() {
        return this.pBoard;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getlines() {
        return this.linesCleared;
    }

    public void setlines(int lines) {
        this.linesCleared = lines;
    }

    // ========================================================================
    // Drawing
    // ========================================================================

    /**
     * player's board on screen
     * 
     * @param x  X offset for board from top left corner
     * @param y  Y offset for board from top left corner
     * @param g2
     */
    public void draw(int x, int y, Graphics2D g2) {
        pBoard.draw(x, y, g2);
        currentPiece.draw(currentPiece.getX(), currentPiece.getY(), g2);
    }

    // ========================================================================
    // Controls
    // ========================================================================

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                currentPiece.setX(currentPiece.getX() - 1);
                break;
            case KeyEvent.VK_RIGHT:
                currentPiece.setX(currentPiece.getX() + 1);
                break;
            case KeyEvent.VK_SPACE:

                break;

        }
    }

}
