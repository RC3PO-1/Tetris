package Tetris;

import java.awt.Font;
import java.awt.Graphics2D;

import Tetris.Piece.Piece;

public class Background {
    private Block Background[][] = new Block[GameConst.maxScreenRow][GameConst.maxScreenCol];
    int points = 0; 
    int lines = 0;
    private int BoffX, BoffY; // board offsets
    Piece next = new Piece("L");

    Font fontBold = new Font("Serif", Font.BOLD, GameConst.tileSize);
    Font fontPlain = new Font("Serif", Font.PLAIN, GameConst.tileSize);


    public Background(int BoffX, int BoffY) {
        this.BoffX = BoffX;
        this.BoffY = BoffY;
        this.Init();
    }

    public void Init() {
        for (int i = 0; i < Background.length; i++) {
            for (int j = 0; j < Background[i].length; j++) {
                Background[i][j] = new Block("X", false);
            }
        }
        for (int i = 0; i < GameConst.boardCol; i++) {
            for (int j = 0; j < GameConst.boardRow; j++) {
                Background[j + BoffY][i + BoffX] = new Block("X", true);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                Background[j + 1][i + 12] = new Block("X", true);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Background[j + 6][i + 12] = new Block("X", true);
            }
        }
    }

    public void draw(Graphics2D g2) {
        for (int i = 0; i < GameConst.maxScreenCol; i++) {
            for (int j = 0; j < GameConst.maxScreenRow; j++) {
                Background[j][i].draw(this.Background[j][i].getColor(), GameConst.tileSize * (i),
                GameConst.tileSize * (j), g2);
            }
        }

        next.draw(13, 7, g2);
        

        g2.setFont(fontBold);
        g2.drawString("Next", (13* GameConst.tileSize)+16, (7 * GameConst.tileSize));
        g2.drawString("Points", (12* GameConst.tileSize), (2 * GameConst.tileSize));
        g2.drawString("Lines", (12* GameConst.tileSize), (4 * GameConst.tileSize));

        g2.setFont(fontPlain);
        g2.drawString(Integer.toString(points), (12* GameConst.tileSize), (3 * GameConst.tileSize));
        g2.drawString(Integer.toString(lines), (12* GameConst.tileSize), (5 * GameConst.tileSize));
    }

    public void setNext(Piece input){
        this.next = input;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getPoints() {
        return points;
    }

    public int getLines() {
        return lines;
    }

}
