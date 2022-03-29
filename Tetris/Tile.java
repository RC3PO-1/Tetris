package Tetris;

import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.imageio.ImageIO;

import Tetris.Constants;

public class Tile {

    private Image I_G;
    private Image I_C;
    private Image I_B;
    private Image I_R;
    private Image I_Y;
    private Image I_O;
    private Image I_M;
    private Image I_X;

    public Tile() {
        try {
            I_G = ImageIO.read(new File("/Resources/basicTile.png"));
            I_C = ImageIO.read(new File("/Resources/basicTile.png"));
            I_B = ImageIO.read(new File("/Resources/basicTile.png"));
            I_R = ImageIO.read(new File("/Resources/basicTile.png"));
            I_Y = ImageIO.read(new File("/Resources/basicTile.png"));
            I_O = ImageIO.read(new File("/Resources/basicTile.png"));
            I_M = ImageIO.read(new File("/Resources/basicTile.png"));
            I_X = ImageIO.read(new File("/Resources/blankTile.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Image getImage(String color) {
        switch (color) {
            case "B":
                return I_B;
            case "C":
                return I_C;
            case "G":
                return I_G;
            case "M":
                return I_M;
            case "O":
                return I_O;
            case "R":
                return I_R;
            case "Y":
                return I_Y;
            default:
                return I_X;
        }
    }

    public void draw(String color, int x, int y, Graphics2D g2) {
        g2.drawImage(getImage(color), x, y, Constants.tileSize, Constants.tileSize, null);
    }
}
